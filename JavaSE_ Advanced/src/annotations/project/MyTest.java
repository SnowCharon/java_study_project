package annotations.project;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MOYU
 * @File JavaSE_Study-annotations.project
 * @Date 2022/6/29 21:27
 **/
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
}
