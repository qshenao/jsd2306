package DaNei;

public class Teacher extends Person{
    Teacher(String name,int age,double salary){
        super(name,age,salary);
    }

    @Override
    void startWork() {
        super.startWork();
    }

    @Override
    void stopWork() {
        super.stopWork();
    }

    @Override
    void finshWork() {
        super.finshWork();
    }
}
