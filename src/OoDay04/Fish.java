package OoDay04;

public class Fish extends Animal implements Swim {
    Fish(){

    }
    Fish(String name,int age,String color){
        super(name,age,color);
    }
    void eat () {
        System.out.println(name + "" + color + "" + age + "正在吃🦐");
    }

    @Override
    void drink() {
        super.drink();
    }

    @Override
    public void swim() {
        System.out.println(color+"色的"+age+"岁的鱼"+name+"正在游泳...");
    }
}



 class Durk extends Animal {
    Durk(){

    }
     Durk(String name,int age,String color){
        super(name,age,color);
    }
    void eat () {
        System.out.println(name + "" + color + "" + age + "正在吃🦐");
    }

    @Override
    void drink() {
        super.drink();
    }

}
