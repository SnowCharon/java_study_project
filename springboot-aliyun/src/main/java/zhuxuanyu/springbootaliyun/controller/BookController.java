package zhuxuanyu.springbootaliyun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: BookController
 * @Author 竹玄羽
 * @Date: 2022/12/12 17:15
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping("{id}")
    public String getBook(@PathVariable Integer id){
        if(id < 10){
            System.out.println("id=" + id);
        }else {
            System.out.println("好耶！阿里云！");
        }
        return getString();
    }

    private static String getString() {
        return "Hello,SpringBoot";
    }
}
