package practice7;

/**
 * @title: a
 * @Author 竹玄羽
 * @Date: 2022/11/17 8:13
 */

public class DangerException extends Exception {
    String message;
    public DangerException() {
        message = "危险品!";
    }
    public void toShow() {
        System.out.print(message+" ");
    }
}

