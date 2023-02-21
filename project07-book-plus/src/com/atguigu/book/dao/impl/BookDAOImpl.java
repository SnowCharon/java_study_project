package com.atguigu.book.dao.impl;

import com.atguigu.book.dao.BookDAO;
import com.atguigu.book.pojo.Book;
import com.atguigu.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @title: BookDAOImpl
 * @Author 竹玄羽
 * @Date: 2022/9/12 15:45
 */

public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {
    @Override
    public List<Book> getBookList() {
        return executeQuery("SELECT * FROM t_book WHERE bookStatus = 0");
    }

    @Override
    public Book getBook(Integer id) {
        return load("SELECT * FROM t_book WHERE id = ?", id);
    }
}
