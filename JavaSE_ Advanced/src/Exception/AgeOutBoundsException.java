package Exception;

/**
 * @author MOYU
 * @File JavaSE_Study-Exception
 * @Date 2022/6/1 10:52
 **/
public class AgeOutBoundsException extends RuntimeException{
    //自定义异常

    public AgeOutBoundsException() {
    }

    public AgeOutBoundsException(String message) {
        super(message);
    }
}
