package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MOYU
 * @File JavaSE_Study-log
 * @Date 2022/6/25 11:25
 * 目标：快速搭建logback日志框架，记录程序执行情况，到文件中
 **/
public class logback {
    //创建logback的日志对象，代表了日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("logback");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行");
            LOGGER.info("我开始记录第二行日志，我要开始做除法");
            int a = 10;
            int b = 0;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);

            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能出现异常：" + e);
        }
    }
}
