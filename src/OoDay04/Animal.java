package OoDay04;

public  abstract class Animal {
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
   abstract void eat ();

    void drink (){
        System.out.println(name+""+color+""+age+"正在喝水");
    }

}
