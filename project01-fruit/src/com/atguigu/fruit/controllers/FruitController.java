package com.atguigu.fruit.controllers;


import com.atguigu.fruit.pojo.Fruit;
import com.atguigu.fruit.service.FruitService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

public class FruitController {

    private final FruitService fruitService = null;

    private String update(Integer fid, String fname, Integer price, Integer fcount, String remark) {
        //3.执行更新
        fruitService.updateFruit(new Fruit(fid, fname, price, fcount, remark));

        //4.资源跳转
        //super.processTemplate("index",request,response);
        //request.getRequestDispatcher("index.html").forward(request,response);
        //此处需要重定向，目的是重新给IndexServlet发请求，重新获取furitList，然后覆盖到session中，这样index.html页面上显示的session中的数据才是最新的
        return "redirect:fruit.do";
    }

    private String edit(Integer fid, HttpServletRequest request) {
        if (fid != null) {
            Fruit fruit = fruitService.getFruitByFid(fid);
            request.setAttribute("fruit", fruit);
//            super.processTemplate("edit",request,response);
            return "edit";
        }
        return "error";
    }

    private String del(Integer fid) {
        if (fid != null) {
            fruitService.delFruit(fid);
            return "redirect:fruit.do";
        }
        return "error";
    }

    private String add(String fname, Integer price, Integer fcount, String remark) {
        Fruit fruit = new Fruit(0, fname, price, fcount, remark);
        fruitService.addFruit(fruit);
        return "redirect:fruit.do";
    }

    private String index(String oper, String keyword, Integer pageNo, HttpServletRequest request) {
        HttpSession session = request.getSession();

        if (pageNo == null) {
            pageNo = 1;
        }
        if (com.atguigu.myssm.utils.StringUtil.isNotEmpty(oper) && "search".equals(oper)) {
            pageNo = 1;
            if (com.atguigu.myssm.utils.StringUtil.isEmpty(keyword)) {
                keyword = "";
            }
            session.setAttribute("keyword", keyword);
        } else {
            Object keywordObj = session.getAttribute("keyword");
            if (keywordObj != null) {
                keyword = (String) keywordObj;
            } else {
                keyword = "";
            }
        }

        // 重新更新当前页的值
        session.setAttribute("pageNo", pageNo);

        List<Fruit> fruitList = fruitService.getFruitList(keyword, pageNo);
        session.setAttribute("fruitList", fruitList);

        int pageCount = fruitService.getPageCount(keyword);
        session.setAttribute("pageCount", pageCount);
        return "index";
    }
}
