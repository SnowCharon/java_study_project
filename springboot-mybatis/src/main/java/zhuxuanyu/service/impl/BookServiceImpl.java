package zhuxuanyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.pojo.Book;
import zhuxuanyu.service.BookService;
import zhuxuanyu.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【t_book】的数据库操作Service实现
* @createDate 2023-01-16 14:47:38
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

}




