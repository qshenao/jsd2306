package OoDay02;

public class Animal {
    String name;
    int age;
    String color;
    Animal(){

    }
    Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void eat (){
        System.out.println(name+""+color+""+age+"正在吃饭");
    }
    void drink (){
        System.out.println(name+""+color+""+age+"正在喝水");
    }

}
