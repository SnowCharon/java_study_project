package zhuxuanyu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @title: BookController
 * @Author 竹玄羽
 * @Date: 2022/12/12 17:15
 */
@RestController
@RequestMapping("/book")
public class BookController {
    //获取配置文件的数据
    @Value("${country}")
    private String country;


    @GetMapping("{id}")
    public String getBook(@PathVariable Integer id) {
        if (id < 10) {
            System.out.println("id=" + id);
        } else {
            System.out.println("好耶！");
        }
        System.out.println(country);
        return getString();
    }

    private static String getString() {
        return "Hello,SpringBoot";
    }
}
