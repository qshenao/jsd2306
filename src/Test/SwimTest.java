package Test;

public class SwimTest {
    public static void main(String[] args) {
        Dog dog=new Dog("小黄",5,"黄");
        dog.eat();
        dog.lookHome();
        dog.swim();
        Chick chick=new Chick("金金",2,"金");
        chick.eat();
        chick.layEggs();
        Fish fish=new Fish("小白",3,"白");
        fish.swim();
        fish.eat();
        Dog[]dogs=new Dog[3];
        dogs[0]=new Dog("小黄",5,"黄");
        dogs[1]=new Dog("小蓝",5,"蓝");
        dogs[2]=new Dog("小白",5,"白");
        for (int i=0;i< dogs.length;i++){
            System.out.println(dogs[i].name);
            dogs[i].eat();
        }
        Fish[]fishs=new Fish[2];
        fishs[0]=new Fish("小金",3,"金");
        fishs[1]=new Fish("小银",2,"银");
        for (int i=0;i< fishs.length;i++){
            System.out.println(fishs[i].name);
            fishs[i].eat();
        }
        Chick[]chicks=new Chick[2];
        chicks[0]=new Chick("小花",5,"白");
        chicks[1]=new Chick("小鸡子",5,"黑白");
        for (int i=0;i< chicks.length;i++){
            System.out.println(chicks[i].name);
            chicks[i].eat();
        }

    }
}
