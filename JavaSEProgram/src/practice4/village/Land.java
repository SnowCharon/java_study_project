package practice4.village;

/**
 * @title: Land
 * @Author 竹玄羽
 * @Date: 2022/10/13 8:05
 */

public class Land {
    public static void main(String[] args) {
        //用类名调用setWaterAmount(int m)，并向参数传值200
        Village.setWaterAmount(200);
        //用Village类的类名访问waterAmount
        int leftWater = Village.waterAmount;
        System.out.println("水井中有" + leftWater + "升水");
        Village zhaoZhuang, maJiaHeZhi;
        zhaoZhuang = new Village("赵庄");
        maJiaHeZhi = new Village("马家河子");
        zhaoZhuang.setPeopleNumber(80);
        maJiaHeZhi.setPeopleNumber(120);
        //zhaoZhuang调用drinkWater(int n)，并向参数传值50
        zhaoZhuang.drinkWater(50);
        //maJiaHeZhi调用lookWaterAmount()方法
        leftWater = maJiaHeZhi.lookWaterAmount();
        String name = maJiaHeZhi.name;
        System.out.println(name + "发现水井中有" + leftWater + "升水");
        maJiaHeZhi.drinkWater(100);
        //zhaoZhuang调用lookWaterAmount()方法
        leftWater = zhaoZhuang.lookWaterAmount();
        name = zhaoZhuang.name;
        System.out.println(name + "发现水井中有" + leftWater + "升水");
        int peopleNumber = zhaoZhuang.getPeopleNumber();
        System.out.println("赵庄的人口:" + peopleNumber);
        peopleNumber = maJiaHeZhi.getPeopleNumber();
        System.out.println("马家河子的人口：" + peopleNumber);
    }
}
