package zhuxuanyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zhuxuanyu.config.ServerConfig;

import javax.sql.DataSource;

/**
 * @author zhuxuanyu
 */
@SpringBootApplication
public class SpringbootConfigurationApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConfigurationApplication.class, args);
        ServerConfig bean = context.getBean(ServerConfig.class);
        System.out.println(bean);
    }

}
