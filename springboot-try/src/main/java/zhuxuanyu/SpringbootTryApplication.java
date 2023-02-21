package zhuxuanyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zhuxuanyu.controller.BookController;

@SpringBootApplication
@MapperScan("zhuxuanyu.mapper")
public class SpringbootTryApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootTryApplication.class, args);
		BookController bean = context.getBean(BookController.class);
		System.out.println(bean);
	}
}
