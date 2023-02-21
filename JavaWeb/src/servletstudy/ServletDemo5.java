package servletstudy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: ServletDemo5
 * @Author 竹玄羽
 * @Date: 2022/8/17 2:14
 */
public class ServletDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.定义一个商品金额
        int money = 1000;

        //2.获取访问资源路径
        String path = req.getRequestURI();
        path = path.substring(path.lastIndexOf("/"));

        //3.条件判断
        if ("/vip".equals(path)) {
            System.out.println("商品原价为" + money + "优惠是" + money * 0.9);
        } else if ("/vvip".equals(path)) {
            System.out.println("商品原价为" + money + "优惠是" + money * 0.5);
        } else {
            System.out.println("商品原价为" + money);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
