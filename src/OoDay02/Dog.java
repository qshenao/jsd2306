package OoDay02;

public class Dog extends Animal {

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

}
