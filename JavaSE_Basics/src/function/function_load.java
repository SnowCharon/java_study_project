package function;

/**
 * @author 竹玄羽
 * @File function
 * @date 2022/5/15  17:09
 **/
public class function_load {
    public static void main(String[] args) {
        fire();
        fire("New York");
        fire("Washington",100000000);
    }

    public static void fire(){
        fire("美国");
    }

    public static void fire(String location){
        fire(location,100);
    }

    public static void fire(String location,int num){
        System.out.println("给" + location + "发射" + num + "枚核弹");
    }
}

