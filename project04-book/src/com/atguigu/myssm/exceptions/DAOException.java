package com.atguigu.myssm.exceptions;

/**
 * @title: DAOException
 * @Author 竹玄羽
 * @Date: 2022/9/7 22:30
 */
public class DAOException extends RuntimeException {
    public DAOException(String msg) {
        super(msg);
    }
}