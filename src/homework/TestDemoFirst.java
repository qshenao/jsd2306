package homework;

public class TestDemoFirst {
    public static void main(String[] args) {
                StudentFirst zs=new StudentFirst("张三",23,'男',"","");
                zs.sayHi();
                zs.study();
                zs.playgame("李四");
                StudentFirst ls=new StudentFirst();
                ls.sayHi();
                ls.sayHi();
                ls.playgame("张三");
                Carfirst car=new Carfirst("奥迪",6461615,"黑色");
                car.start();
                car.run();
                car.stop();
                Carfirst car2 = new Carfirst();
                car2.brand = "奔弛";
                car2.color = "黑";
                car2.price = 8000000;
                car2.start();
                car2.run();
                car2.stop();
            }
        }


