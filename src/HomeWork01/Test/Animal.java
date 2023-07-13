package Test;

public abstract class Animal {
    String name;
    int age;
    String color;
    Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void drink(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
    }
    abstract void eat();

}
