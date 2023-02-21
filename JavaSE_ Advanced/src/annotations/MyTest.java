package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MOYU
 * @File JavaSE_Study-annotations
 * @Date 2022/6/29 21:04
 **/
@Target(ElementType.METHOD)//元注解
@Retention(RetentionPolicy.RUNTIME)//一直活着
public @interface MyTest {
}
