package Doday021;

public class Fish extends Animal{
    Fish(){

    }
    Fish(String name,int age,String color){
        super(name,age,color);
    }

    @Override
    void eat() {
        System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在吃小鱼...");
    }
}
