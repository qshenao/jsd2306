package OoDay03;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog=new Dog("老刘",25,"黄色");
        dog.lookHome();
        dog.eat();
        dog.drink();
        Fish fish=new Fish("小刘",2,"银色");
        fish.drink();
        fish.eat();
        Chick chick=new Chick("大刘",5,"红色");
        chick.drink();
        chick.eat();
        chick.layEggs();
      Durk durk=new Durk("小刘",2,"银色");
        durk.drink();
        durk.eat();
    }
}
