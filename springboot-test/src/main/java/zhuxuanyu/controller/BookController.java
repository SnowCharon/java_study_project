package zhuxuanyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: BookController
 * @Author 竹玄羽
 * @Date: 2023/1/23 22:00
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping
    public String get(){
        System.out.println("bookController is running!");
        return "springboot";
    }
}
