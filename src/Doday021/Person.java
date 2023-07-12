package Doday021;

public class Person {
    String name;
    int age;
    String address;
    Person(){

    }
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void eat(){
        System.out.println(name+"正在吃饭");
    }
    void sleep(){
        System.out.println(name+"正在睡觉");
    }
    void sayHi(){
        System.out.println();
    }

}
