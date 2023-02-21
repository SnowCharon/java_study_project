package ObjectOriented;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File Object_Oriented
 * @date 2022/5/17  19:33
 **/
public class ShopCarTest {
    public static void main(String[] args) {
        //1.定义商品类
        //2.定义购物车对象，使用一个数组对象
        Goods[] ShopCar = new Goods[100];
        //3.搭建操作架构
        OUT:
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("在购物车查询商品：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算商品金额：pay");
            System.out.println("退出购物车：exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令：");
            String command = sc.next();

            switch (command) {
                case "add":
                    //添加商品
                    addGoods(ShopCar, sc);
                    break;
                case "query":
                    //查询购物车商品
                    queryGoods(ShopCar);
                    break;
                case "update":
                    //修改商品的购买数量
                    updateGoods(ShopCar, sc);
                    break;
                case "pay":
                    //结算金额
                    payGoods(ShopCar);
                    break;
                case "exit":
                    break OUT;
                default:
                    System.out.println("输入错误！");
            }
            System.out.println();
            System.out.println();
        }

    }

    //函数功能实现
    public static void addGoods(Goods[] shopCar, Scanner sc) {
        //a.录入商品
        System.out.println("请您输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请您输入商品的价格：");
        double price = sc.nextDouble();
        System.out.println("请您输入商品编号（不重复）:");
        int id = sc.nextInt();
        System.out.println("请您输入购买数量:");
        int bayNumber = sc.nextInt();

        //b.接收数据
        Goods good = new Goods();
        good.name = name;
        good.price = price;
        good.id = id;
        good.bayNumber = bayNumber;

        //c.把商品添加到购物车
        //ShopCar = [null ,null ,null.....]
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = good;
                System.out.println("您的商品" + good.name + "已经添加到购物车");
                break;
            }
            if (shopCar[shopCar.length - 1] != null) {
                System.out.println("您的购物车已满，无法添加！");
            }
        }
    }

    public static void queryGoods(Goods[] shopCar) {
        if (shopCar[0] == null) {
            System.out.println("您的购物车暂无商品，快去添加吧！");
            return;
        }

        System.out.println("============查询购物车信息如下===========");
        System.out.println("名称\t\t\t价格\t\t\t编号\t\t\t购买数量\n");
        for (Goods good : shopCar) {
            if (good != null) {
                //展示商品
                System.out.println(good.name + "\t\t\t" + good.price + "\t\t\t" + good.id + "\t\t\t" + good.bayNumber);
            } else {
                //遍历结束
                break;
            }
        }
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        //让用户输入商品id或者名称\
        int id;
        String name;
        Goods good;
        while (true) {
            System.out.print("请选择输入商品id或者名称(name/id/退出修改请输入null)：");
            String find = sc.next();
            if (find == "name") {
                System.out.print("请输入商品名称：");
                name = sc.next();
                good = getGoodsByName(shopCar, name);
            } else {
                System.out.print("请输入商品id：");
                id = sc.nextInt();
                good = getGoodsById(shopCar, id);
            }
            if (good == null) {
                System.out.println("未找到该商品信息！");
                return;
            } else {
                while (true) {
                    System.out.print("请您输入要修改的信息（name/price/id/bayNumber,退出修改请输入exit）：");
                    String chose = sc.next();
                    switch (chose) {
                        case "name":
                            System.out.println("请输入新的商品名称：");
                            good.name = sc.next();
                            break;
                        case "price":
                            System.out.println("请输入新的商品价格：");
                            good.price = sc.nextDouble();
                            break;
                        case "id":
                            System.out.println("请输入新的商品id:");
                            good.id = sc.nextInt();
                            break;
                        case "bayNumber":
                            System.out.println("请输入新的商品购买数量：");
                            good.bayNumber = sc.nextInt();
                            break;
                        case "exit":
                            System.out.println("退出修改！");
                            return;
                        default:
                            System.out.println("输入错误！");
                    }
                }

            }
        }

    }

    public static void payGoods(Goods[] shopCar) {
        queryGoods(shopCar);
        //a.定义求和变量为0
        double sum = 0;
        //2.遍历购物车全部商品对象，累加单价*数量
        for (int i = 0; i < shopCar.length; i++) {
            Goods good = shopCar[i];
            if (good != null) {
                sum += (good.price * good.buyNumber);
            } else {
                break;
            }
        }
        System.out.println("购物车结算总金额：" + sum);
    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (Goods good : shopCar) {
            if (good != null) {
                if (good.id == id) {
                    return good;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public static Goods getGoodsByName(Goods[] shopCar, String name) {
        for (Goods good : shopCar) {
            if (good != null) {
                if (Objects.equals(good.name, name)) {
                    return good;
                }
            } else {
                return null;
            }
        }
        return null;
    }
}
