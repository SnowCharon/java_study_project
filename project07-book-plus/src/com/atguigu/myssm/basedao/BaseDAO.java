package com.atguigu.myssm.basedao;


import com.atguigu.myssm.exceptions.DAOException;
import com.atguigu.myssm.utils.ConnectionUtil;
import com.atguigu.myssm.utils.MyTypeUtil;

import java.lang.reflect.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @title: BaseDAO
 * @Author 竹玄羽
 * @Date: 2022/9/7 22:28
 */
public abstract class BaseDAO<T> {
    protected Connection connection;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;

    //T的Class对象
    private Class<?> entityClass;

    public BaseDAO() {
        //getGenericSuperclass()获取到的是BaseDAO的Class
        Type genericType = getClass().getGenericSuperclass();
        //ParameterizedType 参数化类型
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
        //获取到的<T>中的T的真实的类型
        Type actualType = actualTypeArguments[0];

        try {
            entityClass = Class.forName(actualType.getTypeName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new DAOException("BaseDAO 构造方法出错了，可能的原因是没有指定<>中的类型");
        }
    }

    protected Connection getConnection() {
        return ConnectionUtil.getConnection();
    }

    //给预处理命令对象设置参数
    private void setParams(PreparedStatement preparedStatement, Object... params) throws SQLException {
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
    }

    //执行更新，返回影响行数
    protected int executeUpdate(String sql, Object... params) {
        boolean insertFlag = false;
        insertFlag = sql.trim().toUpperCase().startsWith("INSERT");

        connection = getConnection();
        try {
            if (insertFlag) {
                preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            } else {
                preparedStatement = connection.prepareStatement(sql);
            }
            setParams(preparedStatement, params);
            int count = preparedStatement.executeUpdate();
            if (insertFlag) {
                resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    return ((Long) resultSet.getLong(1)).intValue();
                }
            }
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException("BaseDAO executeUpdate出错了");
        }
    }

    //通过反射技术给obj对象的property属性赋propertyValue值
    private void setValue(Object object, String property, Object propertyValue) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<?> objectClass = object.getClass();
        //获取property这个字符串对应的属性名
        Field field = objectClass.getDeclaredField(property);

        if (field != null) {
            //获取当前字段的类型名称
            String typeName = field.getType().getName();

            //判断如果是自定义类型，则需要调用这个自定义类的带一个参数的构造方法，创建出这个自定义的实例对象，然后将实例对象赋值给这个属性
            if (MyTypeUtil.isMyType(typeName)) {
                //假设typeName是"com.atguigu.qqzone.pojo.UserBasic"
                Class<?> typeNameClass = Class.forName(typeName);
                Constructor<?> constructor = typeNameClass.getDeclaredConstructor(Integer.class);
                propertyValue = constructor.newInstance(propertyValue);
            }

            //因为MySQL8的bug，所以需要特殊处理时间类型
            if (propertyValue.getClass().toString().equals("class java.time.LocalDateTime")) {
                propertyValue = Timestamp.valueOf((LocalDateTime) propertyValue);
            }

            field.setAccessible(true);
            field.set(object, propertyValue);
        }
    }


    //执行复杂查询，返回例如统计结果
    protected Object[] executeComplexQuery(String sql, Object... params) {
        connection = getConnection();

        try {
            preparedStatement = connection.prepareStatement(sql);
            setParams(preparedStatement, params);
            resultSet = preparedStatement.executeQuery();

            //通过rs可以获取结果集的元数据 元数据：描述结果集数据的数据 , 简单讲，就是这个结果集有哪些列，什么类型等等
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            //获取结果集的列数
            int columnCount = resultSetMetaData.getColumnCount();
            Object[] columnValueArray = new Object[columnCount];
            //解析rs
            if (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    Object columnValue = resultSet.getObject(i + 1);
                    columnValueArray[i] = columnValue;
                }
                return columnValueArray;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException("BaseDAO executeComplexQuery出错了");
        }
        return null;
    }

    //执行查询，返回单个实体对象
    protected T load(String sql, Object... params) {
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            setParams(preparedStatement, params);
            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            //获取结果集的列数
            int columnCount = resultSetMetaData.getColumnCount();
            //6.解析rs
            if (resultSet.next()) {
                T entity = (T) entityClass.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    String columnName = resultSetMetaData.getColumnName(i + 1);
                    Object columnValue = resultSet.getObject(i + 1);
                    setValue(entity, columnName, columnValue);
                }
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException("BaseDAO load出错了");
        }
        return null;
    }

    //执行查询，返回List
    protected List<T> executeQuery(String sql, Object... params) {
        List<T> list = new ArrayList<>();
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            setParams(preparedStatement, params);
            resultSet = preparedStatement.executeQuery();

            ResultSetMetaData rsmd = resultSet.getMetaData();
            //获取结果集的列数
            int columnCount = rsmd.getColumnCount();
            //6.解析rs
            while (resultSet.next()) {
                T entity = (T) entityClass.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    String columnName = rsmd.getColumnLabel(i + 1);
                    Object columnValue = resultSet.getObject(i + 1);
                    setValue(entity, columnName, columnValue);
                }
                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException("BaseDAO executeQuery出错了");
        }
        return list;
    }
}

