package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MOYU
 * @File JavaSE_Study-annotations
 * @Date 2022/6/28 16:14
 **/
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //特殊属性
    String value();
  double price() default 100;
  String[] authors();
}
