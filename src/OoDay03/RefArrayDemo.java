package OoDay03;

public class RefArrayDemo {
    public static void main(String[] args) {
        /*
        //声明一个Dog类型的数组dogs，包含3个元素，每一个元素都是Dog型，默认值为null
        Dog[] dogs=new Dog[3];
        //声明一个Chick类型的数组chicks，包含3个元素，每一个元素都是Chick型，默认值为null
        Chick[]chicks=new Chick[3];
        //声明一个Fish类型的数组fish，包含3个元素，每一个元素都是Fish型，默认值为null
        Fish[]fish=new Fish[2];
         */

        Dog [] dogs=new Dog[3];
        dogs[0]=new Dog("小黄",6,"黄色");
        dogs[1]=new Dog("小白",2,"白色");
        dogs[2]=new Dog("小金",3,"金色");
        System.out.println(dogs[0].name);
        dogs[1].age=4;
        dogs[2].swim();
        for (Dog dog : dogs) {
            System.out.println(dog.name);
        }
        Chick []chicks=new Chick[2];
        chicks[0]=new Chick("小花",3,"花");
        chicks[1]=new Chick("大花",2,"花");
        for (int i=0;i< chicks.length;i++){
            System.out.println(chicks[i].name);
            chicks[i].layEggs();
        }
        Fish[]fish=new Fish[3];
        fish[0]=new Fish("小金",2,"金");
        fish[1]=new Fish("小银",3,"银");
        fish[2]=new Fish("小黄",3,"黄");
        for (int i=0;i< fish.length;i++){
            System.out.println(fish[i].name);
            fish[i].swim();
        }


    }
}
