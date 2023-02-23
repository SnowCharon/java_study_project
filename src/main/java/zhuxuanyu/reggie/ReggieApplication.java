package zhuxuanyu.reggie;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhuxuanyu
 */
@Slf4j
@EnableCaching
@SpringBootApplication
@MapperScan("zhuxuanyu.reggie.generator.mapper")
@ServletComponentScan(value = "zhuxuanyu.reggie")
@EnableTransactionManagement
public class ReggieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功！");
    }

}
