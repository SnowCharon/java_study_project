package com.atguigu.myssm.utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @title: ConnectionUtil
 * @Author 竹玄羽
 * @Date: 2022/9/7 22:38
 */
public class ConnectionUtil {
    private static final ThreadLocal<Connection> threadLocal = new InheritableThreadLocal<>();
    static Properties properties = new Properties();

    static {
        InputStream is = ConnectionUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //创建连接
    public static Connection createConnection() {
        try {
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            return dataSource.getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //获取连接
    public static Connection getConnection() {
        Connection connection = threadLocal.get();
        if (connection == null) {
            connection = createConnection();
            threadLocal.set(connection);
        }
        return threadLocal.get();
    }

    //关闭连接
    public static void closeConnection() throws SQLException {
        Connection connection = threadLocal.get();
        if (connection == null) {
            return;
        }
        if (!connection.isClosed()) {
            connection.close();
            threadLocal.remove();
        }
    }
}
