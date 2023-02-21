package com.atguigu.book.controller;

import com.atguigu.book.pojo.Book;
import com.atguigu.book.service.BookService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @title: BookController
 * @Author 竹玄羽
 * @Date: 2022/9/12 15:52
 */

public class BookController {
    private BookService bookService;


    public String index(HttpSession session) {
        List<Book> bookList = bookService.getBookList();
        session.setAttribute("bookList", bookList);
        return "index";
    }
}
