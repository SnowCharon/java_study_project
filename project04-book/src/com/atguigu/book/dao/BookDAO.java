package com.atguigu.book.dao;

import com.atguigu.book.pojo.Book;

import java.util.List;

public interface BookDAO {
    //List<Book> getBookList(Integer minprice,Integer maxprice,String pageNo);
    List<Book> getBookList();

    Book getBook(Integer id);
}
