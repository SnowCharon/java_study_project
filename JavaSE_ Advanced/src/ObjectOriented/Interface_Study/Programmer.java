package ObjectOriented.Interface_Study;

/**
 * @author 竹玄羽
 * @File API_interface
 * @date 2022/5/24  19:51
 **/
public class Programmer implements Sport_implements {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "敲字如飞！");
    }

    @Override
    public void competition() {
        System.out.println(name + "参加黑客比赛，为国争光");
    }

    @Override
    public void rule() {
        System.out.println(name + "必须遵纪守法！");
    }

    @Override
    public void eat() {
        System.out.println(name + "必须吃饭！");
    }

    @Override
    public void drink() {
        System.out.println(name + "必须喝水！");
    }
}
