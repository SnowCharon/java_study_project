package practice4;

/**
 * @title: Family
 * @Author 竹玄羽
 * @Date: 2022/10/8 8:33
 */

public class Family {
    TV homeTV;

    void buyTV(TV tv){
        homeTV = tv;
    }

    void remoteControl(int m){
        homeTV.setChannel(m);
    }

    void seeTV(){
        homeTV.showProgram();
    }
}
