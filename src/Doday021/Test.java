package Doday021;

public class Test {
    public static void main(String[] args) {
        Student zs=new Student("张三",25,"曹县","jsd2306","01");
        zs.sayHi();
        zs.study();
        zs.eat();
        zs.sleep();
        Teacher ls=new Teacher("李四",30,"芜湖",66666.66);
        ls.teach();
        ls.sayHi();
        Doctor ww=new Doctor("王五",35,"蚌埠","主任医师");
        ww.cut();
    }

}
