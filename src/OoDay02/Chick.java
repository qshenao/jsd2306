package OoDay02;

public class Chick extends Animal {

    Chick(){
    }
    Chick(String name,int age,String color){
        super(name,age,color);

    }
    void layEggs(){
        System.out.println(""+color+""+age+"正在下蛋");
    }
    void eat () {
        System.out.println(name + "" + color + "" + age + "正在吃小米");
    }

    @Override
    void drink() {
        super.drink();
    }

}
