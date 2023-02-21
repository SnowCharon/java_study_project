package zhuxuanyu.reggie.interceptor;

/**
 * @title: LoginInterceptor
 * @Author 竹玄羽
 * @Date: 2023/2/12 14:59
 */
/*@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    *//**
     * 目标方法执行前——检查登录状态
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param handler  chosen handler to execute, for type and/or instance evaluation
     * @return 未登录就重定向到登录界面，登陆了就放行
     *//*
    @Override
    public boolean preHandle(HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
        Object currentId = request.getSession().getAttribute("currentId");
        log.info("拦截器触发,拦截到请求：{}",request.getRequestURI());
        //判断登录状态，如果已登录，则直接放行
        if (currentId == null) {
            //重定向但是没有任何的数据存储，可以使用转发
            log.info("用户未登录");
            //如果未登录则返回未登录结果，通过输出流方式向客户端页面响应数据
            response.getWriter().write(JSON.toJSONString(Result.error("NOTLOGIN")));
            return false;
        }
        log.info("用户已登录，用户id为：{}", request.getSession().getAttribute("currentId"));
        BaseContext.setCurrentId((Long) request.getSession().getAttribute("currentId"));
        return true;
    }
}*/
