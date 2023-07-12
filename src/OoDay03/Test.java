package OoDay03;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("刘",2,"黄");
        dog.eat();//Dog 类重写之后的
        dog.drink();//复用Animal类的
        dog.lookHome();//Dog类重写子后的
        dog.swim();//dog类重写的
        Fish fish=new Fish("刘",2,"黄");
        fish.eat();//Dog 类重写之后的
        fish.drink();//复用Animal类的
        fish.swim();//dog类重写的

    }
}
