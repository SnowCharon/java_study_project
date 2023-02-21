package log.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MOYU
 * @File JavaSE_Study-log.log4j
 * @Date 2022/7/8 12:42
 **/
public class Log4jTest {
    /**
     * 1.通过log4jAPI来获取日志对象
     * 弊端：以后更换日志实现类，下面也得改
     */
    //private static final Logger LOGGER = Logger.getLogger(Log4jTest.class);

    /**
     *2.使用slf4j的API获取对象
     * 好处：以后更换实现类，下面代码不需要修改
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4jTest.class);
    public static void main(String[] args) {



    }
}
