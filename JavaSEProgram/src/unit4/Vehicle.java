package unit4;

/**
 * @title: Vehicle
 * @Author 竹玄羽
 * @Date: 2022/9/29 9:06
 */

public class Vehicle {
    //声明double型变量speed,刻画速度
    double speed = 0.0;
    //声明int型变量power,刻画功率
    int power = 0;

    void speedUp(int s) {
       //将参数s的值与成员变量speed的和赋值给成员变量speed
        speed += s;
    }

    void speedDown(int d) {
        //将成员变量speed与参数d的差赋值给成员变量speed
        speed -= d;
    }

    void setPower(int p) {
        //将参数p的值赋值给成员变量power
        power = p;
    }

    int getPower() {
        //返回成员变量power的值
        return power;
    }

    double getSpeed() {
        return speed;
    }
}