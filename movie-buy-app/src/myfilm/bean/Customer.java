package myfilm.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MOYU
 * @File JavaSE_Study-myfilm.bean
 * @Date 2022/6/25 20:19
 * 客户子类角色
 **/
public class Customer extends User{
    // 定义一个属性存储购买记录。
    private Map<String, Boolean> buyMovies = new HashMap<>();

    public Map<String, Boolean> getBuyMovies() {
        return buyMovies;
    }

    public void setBuyMovies(Map<String, Boolean> buyMovies) {
        this.buyMovies = buyMovies;
    }
}
