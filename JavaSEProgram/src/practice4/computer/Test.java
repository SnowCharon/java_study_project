package practice4.computer;

/**
 * @title: Test
 * @Author 竹玄羽
 * @Date: 2022/10/8 10:06
 */

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk hardDisk = new HardDisk();
        PC pc = new PC();

        cpu.setSpeed(2200);
        hardDisk.setAmount(200);
        pc.setCPU(cpu);
        pc.setHardDisk(hardDisk);

        pc.show();
    }
}
