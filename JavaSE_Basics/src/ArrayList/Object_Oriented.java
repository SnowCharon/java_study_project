package ArrayList;

import java.util.ArrayList;

/**
 * @author 竹玄羽
 * @File ArrayList
 * @date 2022/5/20  11:37
 **/
public class Object_Oriented {
    public static void main(String[] args) {
        //1.定义电影类
        //2.定义ArrayList存储
        ArrayList<Movie> films = new ArrayList<>();
        //3.创建影片对象，封装电影数据。把对象加入集合中
        films.add(new Movie("《肖申克的救赎》", 9.7, "小李子"));
        films.add(new Movie("《魁拔》", 9.5, "蛮吉"));
        films.add(new Movie("《战狼2》", 9.6, "吴京"));
        System.out.println(films);
        //4.遍历集合，输出
        for (int i = 0; i < films.size(); i++) {
           Movie film = films.get(i);
            System.out.println("片名：" + film.getName());
            System.out.println("评分：" + film.getScore());
            System.out.println("主演：" + film.getActor());        }


    }
}
