package OoDay01;

public class Student {
    String name;
    int age;
    char sex;
    String className;
    String stuId;
    Student(){
    this("无名氏","null","null",'0',0);
}
    //构造方法
    Student(String name,String className ,String stuId,char sex,int age){
        this.name=name;
        this.className=className;
        this.stuId=stuId;
        this.sex=sex;
        this.age=age;

    }


    void study(){
        System.out.println("学号"+this.stuId+"，姓名"+this.name+"在学习");
    }
    void sayHi(){
        System.out.println("学号"+this.stuId+"，姓名"+this.name+", "+"班级名称"+this.className
                +"，性别"+this.sex+"，"+this.age+"岁");

    }
    void playWith(String anotherName){
        System.out.println(this.name+"和"+anotherName+"一起玩....");
    }





}
