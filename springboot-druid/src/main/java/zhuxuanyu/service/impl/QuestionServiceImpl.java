package zhuxuanyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zhuxuanyu.mapper.QuestionMapper;
import zhuxuanyu.pojo.Question;
import zhuxuanyu.service.QuestionService;

/**
* @author zhuxuanyu
* @description 针对表【t_question(问题)】的数据库操作Service实现
* @createDate 2023-01-15 20:00:40
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




