package OoDay02;

public class ExtendTest {
    public static void main(String[] args) {
        Student zs=new Student();
        zs.name="张三";
        zs.age=25;
        zs.address="德州";
        zs.className="jsd2306";
        zs.stuId="01";
        zs.sayHi();
        zs.study();
        zs.eat();
        zs.sleep();
        Student ls=new Student("李四",26,"加州","jsd2306","02");
        ls.sayHi();
        ls.sleep();
        ls.eat();
        ls.study();
        Teacher ww=new Teacher("王五",28,"泸州",65555.00);
        ww.eat();
        ww.sleep();
        ww.teach();
        ww.sayHi();
        Doctor zl=new Doctor("赵六",30,"郑州","主任");
        zl.eat();
        zl.sleep();
        zl.sayHi();
        zl.cut();


    }
}
