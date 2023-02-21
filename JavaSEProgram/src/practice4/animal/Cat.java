package practice4.animal;

public class Cat extends Animal{
    String name;
    public void cry(){
        System.out.println("喵喵~喵喵~");
    }
    public String getAnimalName(){
        return "猫";
    }
}
