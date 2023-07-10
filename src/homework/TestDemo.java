package homework;

public class TestDemo {
    public static void main(String[] args) {
        Student zs=new Student("张三",23,'男',"","");
        zs.sayHi();
        zs.study();
        zs.playgame("李四");
        Student ls=new Student();
        ls.sayHi();
        ls.sayHi();
        ls.playgame("张三");
        Car car=new Car("奥迪",6461615,"黑色");
        car.start();
        car.run();
        car.stop();
        Car car1=new Car();
        car1.start();
        car1.run();
        car1.stop();
        Car car2 = new Car();
        car2.brand = "奔弛";
        car2.color = "黑";
        car2.price = 80;
        car2.start();
        car2.run();
        car2.stop();
    }
}
