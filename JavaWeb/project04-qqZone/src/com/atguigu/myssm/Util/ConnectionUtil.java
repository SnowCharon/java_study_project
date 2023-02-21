package com.atguigu.myssm.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @title: ConnectionUtil
 * @Author 竹玄羽
 * @Date: 2022/9/1 8:47
 */
public class ConnectionUtil {
    private static final ThreadLocal<Connection> threadLocal = new InheritableThreadLocal<>();

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver" ;
    public static final String URL = "jdbc:mysql://localhost:3306/qqzonedb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    public static final String USER = "root";
    public static final String PWD = "W1281409960" ;

    public static Connection createConnection(){
        try {
            //1.加载驱动
            Class.forName(DRIVER);
            //2.通过驱动管理器获取连接对象
            return DriverManager.getConnection(URL, USER, PWD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Connection getConnection(){
        //获取连接
        Connection connection = threadLocal.get();
        if (connection == null){
            connection = createConnection();
            threadLocal.set(connection);
        }
        return threadLocal.get();
    }

    public static void closeConnection() throws SQLException {
        //获取连接
        Connection connection = threadLocal.get();
        if (connection == null){
            return;
        }
        if (!connection.isClosed()){
            connection.close();
//            threadLocal.set(null);
            threadLocal.remove();
        }
    }
}

