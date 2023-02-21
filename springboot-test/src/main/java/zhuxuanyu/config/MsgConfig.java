package zhuxuanyu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title: MsgConfig
 * @Author 竹玄羽
 * @Date: 2023/1/23 15:25
 */
@Configuration
public class MsgConfig {
    @Bean
    public String msg(){
        return "bean smg!";
    }
}
