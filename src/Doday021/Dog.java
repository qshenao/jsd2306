package Doday021;

public class Dog extends Animal{
    Dog(){

    }
    Dog(String name,int age,String color){
        super(name,age,color);
    }

    @Override
    void eat() {
        System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在吃骨头...");
    }
    void lookHome(){
        System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在看家...");
    }
}
