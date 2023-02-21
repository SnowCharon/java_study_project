package servletstudy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: ServletLife
 * @Author 竹玄羽
 * @Date: 2022/8/16 21:52
 */
public class ServletLife extends HttpServlet {

    /**
     * 对象出生
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("我的对象出生了");
    }

    /**
     * 对象服务
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("对象接收到信息！");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    /**
     * 对象没了
     */
    @Override
    public void destroy() {
        System.out.println("对象没了！");
    }
}
