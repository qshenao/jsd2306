package OoDay01;
//构造方法的演示
public class ConsDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.sayHi();
        Student zs=new Student("张三","jsd2306","01",'男',31);
        zs.study();
        zs.sayHi();
        zs.playWith("李四");
        Student ls=new Student("李四","jsd2306","02",'女',32);
        ls.sayHi();
        ls.study();
        ls.playWith("张三");
        Student ww=new Student("王五","jsd2306","03",'女',23);
        ww.sayHi();
        ww.study();
        ww.playWith("张三");

    }
}
