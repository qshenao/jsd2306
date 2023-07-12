package OoDay02;

public class Fish extends Animal {
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
