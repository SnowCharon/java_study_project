package javabean;

/**
 * @author 竹玄羽
 * @File Object_Oriented
 * @date 2022/5/17  19:33
 **/
public class Goods {
    private String name;
    private double price;
    private int id;         //编号
    private int buyNumber;  //购买数量

    public Goods() {
    }

    public Goods( String name, double price, int id, int buyNumber) {
        this.buyNumber = buyNumber;
        this.name = name;
        this.price = price;
        this.id = id;
        this.buyNumber = buyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }
}
