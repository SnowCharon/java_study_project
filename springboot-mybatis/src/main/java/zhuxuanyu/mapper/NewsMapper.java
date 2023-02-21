package zhuxuanyu.mapper;

import org.apache.ibatis.annotations.Mapper;
import zhuxuanyu.pojo.News;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author zhuxuanyu
* @description 针对表【t_news(新闻)】的数据库操作Mapper
* @createDate 2023-01-15 20:00:40
* @Entity zhuxuanyu.pojo.News
*/
@Mapper
public interface NewsMapper extends BaseMapper<News> {

}




