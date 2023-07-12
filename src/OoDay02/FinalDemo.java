package OoDay02;

public class FinalDemo {
}
class Eoo{
    int a=5;
    int b=10;
    void test(){
        a=5;
         b=66;
         final int c=7;

    }
}
class Foo{
    final void show(){

    }
    void test(){

    }
}
class Goo extends Foo{

  //  void  show() {super.show();}//编译错误，final修饰的方法不能被重写

    @Override
    void test() {
        super.test();
    }
}
//final修饰类
final class Hoo{

}
//class Ioo extends Hoo{ }//编译错误，final的类不能被继承
class Joo{
    void test(){

    }
}
final class Koo extends Joo{
    void tset(String name){

    }
}