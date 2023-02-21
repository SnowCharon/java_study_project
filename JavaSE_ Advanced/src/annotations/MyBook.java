package annotations;

/**
 * @author MOYU
 * @File JavaSE_Study-annotations
 * @Date 2022/6/28 16:11
 **/
public @interface MyBook {
    String name();
    String[] authors();
    double price();
}
