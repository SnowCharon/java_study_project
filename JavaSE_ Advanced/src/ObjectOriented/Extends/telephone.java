package ObjectOriented.Extends;

/**
 * @author 竹玄羽
 * @File Extends
 * @date 2022/5/23  15:57
 * 1.重写的方法必须与被重写方法名称，形参列表一样
 * 2.私有方法不能重写
 * 3.子类重写父类，访问权限必须大于父类，就父类与子类方法前面用相同的词语（public....)，即声明不变，重新实现
 * 4.子类不能重写父类的静态方法
 **/
public class telephone {
    public static void main(String[] args) {
        //认识方法重写
        NewPhone hw = new NewPhone();
        hw.call();
        hw.sendMsg();
    }
}

/*
旧手机：父类
 */
class Phone{
    public void call(){
        System.out.println("打电话！");
    }

    public void sendMsg(){
        System.out.println("发短信！");
    }
}

/*
新手机：子类
 */
class NewPhone extends Phone {
    //重写方法
    @Override       //1.重写校验报错   2.提高代码可读性
    public void call(){
        super.call();   //继承父类
        System.out.println("视频通话！");
    }

    @Override
    public void sendMsg(){
        super.sendMsg();
        System.out.println("有趣的图片！");
    }
}