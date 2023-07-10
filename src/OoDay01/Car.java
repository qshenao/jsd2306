package OoDay01;

public class Car {
    String brand;
    double price;
    String color;
    Car(){

    }
    Car(String brand,double price,String color){
    this.brand=brand;
    this.price=price;
    this.color=color;

    }
    void run(){
        System.out.println("品牌是"+brand+"，价格："+price+"，颜色"+color+"开始驾驶");

    }
    void  start(){
        System.out.println("品牌是"+brand+"，价格："+price+"，颜色"+color+"开始启动");
    }
    void stop(){
        System.out.println("品牌是"+brand+"，价格："+price+"，颜色"+color+"停止了");
    }
}
