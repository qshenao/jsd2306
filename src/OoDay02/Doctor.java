package OoDay02;

public class Doctor extends Person{
    String title;

    Doctor(String name,int age,String address,String title){
        super(name,age,address);
        this.title=title;

    }
    void cut(){
        System.out.println(name+"正在做手术...");
    }

    @Override
    void sayHi(){
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address+",职称："+title );
    }



}
