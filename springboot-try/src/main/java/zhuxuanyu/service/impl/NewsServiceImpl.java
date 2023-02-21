package zhuxuanyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.pojo.News;
import zhuxuanyu.service.NewsService;
import zhuxuanyu.mapper.NewsMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【t_news(新闻)】的数据库操作Service实现
* @createDate 2023-01-15 19:37:43
*/
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News>
    implements NewsService{

}




