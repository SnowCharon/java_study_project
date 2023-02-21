package com.atguigu.myssm.trans;

import com.atguigu.myssm.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @title: TransactionManager
 * @Author 竹玄羽
 * @Date: 2022/9/1 8:40
 */
public class TransactionManager {

    //开启事务
    public static void beginTrans() throws SQLException {
        //取消自动提交
        ConnectionUtil.getConnection().setAutoCommit(false);
    }

    //提交事务
    public static void commit() throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        //提交
        connection.commit();
        ConnectionUtil.closeConnection();
    }

    //回滚事务
    public static void rollback() throws SQLException {
        //回滚
        ConnectionUtil.getConnection().rollback();
    }
}
