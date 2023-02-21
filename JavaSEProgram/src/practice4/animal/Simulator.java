package practice4.animal;

public class Simulator {
    public void playSound(Animal animal1) {
        System.out.println("现在播放" + animal1.getAnimalName() + "类的声音：");
        animal1.cry();
    }
}
