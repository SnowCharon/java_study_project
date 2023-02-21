package com.atguigu.myssm.trans;


import com.atguigu.myssm.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @title: TransactionManager
 * @Author 竹玄羽
 * @Date: 2022/9/7 22:38
 */
public class TransactionManager {
    //开启事务
    public static void beginTrans() throws SQLException {
        ConnectionUtil.getConnection().setAutoCommit(false);
    }

    //提交事务
    public static void commit() throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        connection.commit();
        ConnectionUtil.closeConnection();
    }

    //回滚事务
    public static void rollback() throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        connection.rollback();
        ConnectionUtil.closeConnection();
    }
}
