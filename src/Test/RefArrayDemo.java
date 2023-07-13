package Test;

public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[]dogs=new Dog[3];
        dogs[0]=new Dog("黑",2,"黑");
        dogs[1]=new Dog("白",3,"白");
        dogs[2]=new Dog("红",4,"红");
        for (int i=0;i< dogs.length;i++){
            System.out.println(dogs[i].name);
            dogs[i].eat();
        }
        Fish[]fishs=new Fish[2];
        fishs[0]=new Fish("花花",2,"白");
        fishs[1]=new Fish("零零",3,"灰");
        for (int i=0;i< fishs.length;i++){
            System.out.println(fishs[i].name);
            fishs[i].eat();
        }
        Chick[]chicks=new Chick[2];
        chicks[0]=new Chick("哈哈",5,"红");
        chicks[1]=new Chick("零零",2,"蓝");
        for (int i=0;i< chicks.length;i++){
            System.out.println(chicks[i].name);
            chicks[i].eat();
        }
    }
}
