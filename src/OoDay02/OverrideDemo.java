package OoDay02;

public class OverrideDemo {
    public static void main(String[] args) {
    Student zs=new Student("张三",25,"曹县","jsd2306","01");
    zs.sayHi();
    Teacher ls=new Teacher("李四",27,"芜湖",60000.00);
    ls.sayHi();
    Doctor ww=new Doctor("王五",36,"蚌埠","主任医生");
    ww.sayHi();

    }
}
