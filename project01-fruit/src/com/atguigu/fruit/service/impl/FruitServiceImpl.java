package com.atguigu.fruit.service.impl;


import com.atguigu.fruit.dao.FruitDAO;
import com.atguigu.fruit.pojo.Fruit;
import com.atguigu.fruit.service.FruitService;

import java.util.List;

/**
 * @title: FruitServiceImpl
 * @Author 竹玄羽
 * @Date: 2022/8/29 8:24
 */
public class FruitServiceImpl implements FruitService {
    private final FruitDAO fruitDAO = null;

    @Override
    public List<Fruit> getFruitList(String keyword, Integer pageNo) {
        System.out.println("getFruitList->" + com.atguigu.myssm.utils.ConnectionUtil.getConnection());
        return fruitDAO.getFruitList(keyword, pageNo);
    }

    @Override
    public void addFruit(Fruit fruit) {
        fruitDAO.addFruit(fruit);
    }

    @Override
    public Fruit getFruitByFid(Integer fid) {
        return fruitDAO.getFruitByFid(fid);
    }

    @Override
    public void delFruit(Integer fid) {
        fruitDAO.delFruit(fid);
    }

    @Override
    public Integer getPageCount(String keyword) {
        System.out.println("getPageCount->" + com.atguigu.myssm.utils.ConnectionUtil.getConnection());
        int count = fruitDAO.getFruitCount(keyword);
        return (count + 5 - 1) / 5;
    }

    @Override
    public void updateFruit(Fruit fruit) {
        fruitDAO.updateFruit(fruit);
    }
}
