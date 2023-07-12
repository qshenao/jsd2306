package Doday021;

public class Chick extends Animal {
    Chick() {

    }

    Chick(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(color + "色的" + age + "岁的小鸡" + name + "正在吃🦐...");
    }

    void layEggs() {
        System.out.println(color + "色的" + age + "岁的小鸡" + name + "正在下蛋...");
    }
}


