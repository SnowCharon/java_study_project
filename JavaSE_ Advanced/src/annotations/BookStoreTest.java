package annotations;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-annotations
 * @Date 2022/6/29 21:11
 **/
public class BookStoreTest {
    @Test
   public void parseClass(){
        //a.先得到类对象
        Class<BookStore> bookStoreClass = BookStore.class;
        //b.判断类上是否存在那个注解
        if (bookStoreClass.isAnnotationPresent(Book.class)){
            //c.直接获取该对象
            Book book = bookStoreClass.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        //a.先得到类对象
        Class<BookStore> bookStoreClass = BookStore.class;
        Method m = bookStoreClass.getDeclaredMethod("test");
        //b.判断类上是否存在那个注解
        if (m.isAnnotationPresent(Book.class)){
            //c.直接获取该对象
            Book book = m.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
}
