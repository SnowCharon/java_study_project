package Unit3Branch;

/**
 * @author MOYU
 * @File JavaSE_Study-Practice
 * @Date 2022/6/9 16:16
 **/
public class ShowCurrentTime {
    public static void main(String[] args) {
        //Start : Jan 1 ,1970
        //毫秒
        long totalMilliseconds = System.currentTimeMillis();

        //秒
        long totalSeconds = totalMilliseconds / 1000;

        //当前秒数
        long currentSecond = totalSeconds % 60;

        //总分钟
        long totalMinutes = totalSeconds / 60;

        //当前分钟
        long currentMinute = totalMinutes % 60;

        //总小时
        long totalHours = totalMinutes / 60;

        //当前小时
        long currentHour = totalHours % 24;

        if (currentHour + 8 > 12){
            System.out.println("Current time is " + (currentHour - 4) + ":" + currentMinute + ":" + currentSecond + " PM");
        }else{
            System.out.println("Current time is " + (currentHour - 4) + ":" + currentMinute + ":" + currentSecond + " AM");
        }
    }
}
