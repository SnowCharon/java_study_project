package practice4.computer;

/**
 * @title: PC
 * @Author 竹玄羽
 * @Date: 2022/10/8 9:51
 */

public class PC {
    private CPU cpu;
    private HardDisk HD;

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk HD) {
        this.HD = HD;
    }

    public void show(){
        System.out.println("CPU速度：" + cpu.getSpeed() + " " + "磁盘大小：" + HD.getAmount());
    }
}
