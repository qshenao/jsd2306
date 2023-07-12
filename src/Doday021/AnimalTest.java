package Doday021;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog=new Dog("小黑",2,"黑");
        dog.eat();
        dog.lookHome();
        Fish fish=new Fish("小鱼",2,"银");
        fish.eat();
        Chick chick=new Chick("小黄",2,"黄");
        chick.layEggs();
        chick.eat();
    }
}
