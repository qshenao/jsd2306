package OoDay03;

public class Dog extends Animal implements Swim {

    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void lookHome(){
        System.out.println(""+color+""+age+"正在看家");
    }
    void eat () {
        System.out.println(name + "" + color + "" + age + "正在吃骨头");
    }

        void drink() {
            super.drink();
        }

    @Override
    public void swim() {
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }
}
