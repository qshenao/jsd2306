package OoDay02;

public class Student extends Person {
    String className;
    String stuId;

    Student() {

    }


    Student(String name, int age, String address, String className, String stuId) {
        super(name, age, address);
        this.className = className;
        this.stuId = stuId;


    }

    void study() {
        System.out.println(name + "正在学习...");

    }

    @Override
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了，家住" + address + ",班级名称：" + className + "，学号为：" + stuId);
    }
}




