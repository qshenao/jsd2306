package homework;

public class Car {
    String brand;
    double price;
    String color;
     Car(){
       this("奔驰",561616,"黑色");
    }
     Car(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    void start(){
        System.out.println("品牌是"+brand+"，价格："+price+"，颜色"+color+"车开始启动");
    }
    void run(){
        System.out.println("品牌是"+brand+"，价格："+price+"，颜色"+color+"车正在驾驶");
    }
    void stop(){
        System.out.println("品牌是"+brand+"，价格："+price+"，颜色"+color+"车停下来了");
    }
}
