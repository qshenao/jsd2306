package homework;

public class StudentFirst {
    String name;
    int age;
    char sex;
    String className;
    String stuId;
    StudentFirst(){

    }
    StudentFirst(String name,int age,char sex,String className,String stuId){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.className=className;
        this.stuId=stuId;
    }
    void sayHi(){
        System.out.println("学号"+this.stuId+"，姓名"+this.name+"在学习");
    }
    void study(){
        System.out.println("学号"+this.stuId+"，姓名"+this.name+", "+"班级名称"+this.className
                +"，性别"+this.sex+"，"+this.age+"岁");

    }
    void playgame(String name){
        System.out.println(this.name+"和"+name+"一起玩....");

    }
}
