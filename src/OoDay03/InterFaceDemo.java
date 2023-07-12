package OoDay03;

public class InterFaceDemo {
    public static void main(String[] args) {
       // Inter a=new Inter();//编译错误，接口不能被实例
        Inter a=new Inter() {
            @Override
            public void test() {

            }

            @Override
            public void show() {

            }
        };

    }
}
interface Inter{
    void test();
    abstract void show();//接口中的方法默认是抽象的，前面默认为abstract
    //void test(){};//编译错误，抽象方法不能有方法体
}
interface Inter1{
    void test1();
}
abstract class Aoo{
   abstract void test2();
}
class Boo extends Aoo implements Inter,Inter1{
    @Override
    public void test() {

    }

    @Override
    public void show() {

    }
    public void test1(){

    }

    @Override
    void test2() {

    }

}
//演示接口继承接口
interface Inter3 {
    void show();
}
interface Inter4 extends Inter3{
    void test();
}
class Coo implements Inter4{
    @Override
    public void show() {

    }

    @Override
    public void test() {

    }
}
