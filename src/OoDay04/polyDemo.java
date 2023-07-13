package OoDay04;

public class polyDemo {
    public static void main(String[] args) {
      /*
      Master master=new Master();
       Dog dog=new Dog("小黄",5,"黄");
       Chick chick=new Chick("小花",2,"花");
       Fish fish=new Fish("小金",6,"金");
       master.feed(dog);
       master.feed(fish);
       master.feed(chick);

       */








        Animal dog=new Dog("小黄",2,"黄");
        Animal chick=new Chick("小白",3,"白");
        Animal fish=new Fish("小金",5,"金");
        Animal[]animals=new Animal[5];
        animals[0]=new Dog("小黄",2,"黄");
        animals[1]=new Dog("小白",2,"白");
        animals[2]=new Fish("小金",2,"金");
        animals[3]=new Fish("小银",2,"银");
        animals[4]=new Chick("小灰",2,"灰");
        for (int i=0;i< animals.length;i++){
            System.out.println(animals[i].name);
            animals[i].eat();
            if(animals[i] instanceof Dog){
                Dog dog1=(Dog) animals[i];
                dog1.eat();
                dog1.lookHome();
                dog1.swim();
            }
            if(animals[i] instanceof Fish){
                Fish fish1=(Fish) animals[i];
                fish1.eat();
                fish1.swim();
            }
            if(animals[i] instanceof Chick){
                Chick chick1=(Chick) animals[i];
                chick1.eat();
                chick1.layEggs();
            }
        }


    }
}
