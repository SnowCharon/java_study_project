package annotations;

/**
 * @author MOYU
 * @File JavaSE_Study-annotations
 * @Date 2022/6/29 21:16
 **/
@Book(value = "西游记" ,price = 99.9,authors = {"我","吴承恩"})
public class BookStore {
    @Book(value = "完美世界" ,price = 99.9,authors = {"我","辰东"})
    public void test(){

    }

}
