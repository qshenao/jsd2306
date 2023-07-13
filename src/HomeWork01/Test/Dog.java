package Test;

public class  Dog  extends  Animal implements Swim{

    Dog(String name,int age,String color){
        super(name,age,color);
    }

    @Override
    void eat() {
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
    }


    void lookHome(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }
}
