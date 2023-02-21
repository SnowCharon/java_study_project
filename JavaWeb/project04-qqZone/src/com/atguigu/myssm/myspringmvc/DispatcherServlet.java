package com.atguigu.myssm.myspringmvc;


import com.atguigu.myssm.Util.StringUtil;
import com.atguigu.myssm.exceptions.DispatcherServletException;
import com.atguigu.myssm.ioc.BeanFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@WebServlet("*.do")
public class DispatcherServlet extends ViewBaseServlet {
    private BeanFactory beanFactory;

    public DispatcherServlet() {
    }

    public void init() throws ServletException {
        super.init();
//        beanFactory = new ClassPathXmlApplicationContext();
        ServletContext application = getServletContext();
        Object beanFactoryObject = application.getAttribute("beanFactory");
        if (beanFactoryObject != null) {
            beanFactory = (BeanFactory) beanFactoryObject;
        }else {
            throw new RuntimeException("IOC容器获取失败！");
        }
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
//        request.setCharacterEncoding("UTF-8");
        //假设url是：  http://localhost:8080/pro15/hello.do
        //那么servletPath是：    /hello.do
        // 我的思路是：
        // 第1步： /hello.do ->   hello   或者  /fruit.do  -> fruit
        // 第2步： hello -> HelloController 或者 fruit -> FruitController
        String servletPath = request.getServletPath();
        servletPath = servletPath.substring(1);
        int lastDotIndex = servletPath.lastIndexOf(".do");
        servletPath = servletPath.substring(0, lastDotIndex);

        Object controllerBeanObj = beanFactory.getBean(servletPath);

        String operate = request.getParameter("operate");
        if (StringUtil.isEmpty(operate)) {
            operate = "index";
        }

        try {
            Method[] methods = controllerBeanObj.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (operate.equals(method.getName())) {
                    //1.统一获取请求参数

                    //获取当前方法的参数，返回参数列表
                    Parameter[] parameters = method.getParameters();
//                    parameterValues用来承载参数的值
                    Object[] parameterValues = new Object[parameters.length];
                    for (int i = 0; i < parameterValues.length; i++) {
                        Parameter parameter = parameters[i];
                        String parameterName = parameter.getName();
                        if ("request".equals(parameterName)) {
                            parameterValues[i] = request;
                        } else if ("response".equals(parameterName)) {
                            parameterValues[i] = response;
                        } else if ("session".equals(parameterName)) {
                            parameterValues[i] = request.getSession();
                        } else {
                            //从请求中获取参数值
                            String parameterValue = request.getParameter(parameterName);
                            String typeName = parameter.getType().getTypeName();
                            Object parameterObject = parameterValue;
                            if (parameterObject != null) {
                                if ("java.lang.Integer".equals(typeName)) {
                                    parameterObject = Integer.parseInt(parameterValue);
                                }
                            }

                            parameterValues[i] = parameterObject;
                        }
                    }

                    //2.Controller组件中的方法调用
                    method.setAccessible(true);
                    Object ReturnObject = method.invoke(controllerBeanObj, parameterValues);

                    //3.视图处理
                    String methodReturnStr = (String) ReturnObject;
                    if (methodReturnStr.startsWith("redirect:")) {
                        String redirectStr = methodReturnStr.substring("redirect:".length());
                        response.sendRedirect(redirectStr);
                    } else {
                        super.processTemplate(methodReturnStr, request, response);
                    }
                }

            }

           /* }else{
                throw new RuntimeException("operate值非法!");
            }*/
        } catch (Exception e) {
            e.printStackTrace();
            throw new DispatcherServletException("DispatcherServlet 出错了！");
        }
    }
}
