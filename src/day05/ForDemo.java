package day05;

public class ForDemo {
    public static void main(String[] args) {

        for (int i=1;i<=9;i++){
            if (i%4==0){
                continue;
            }
            System.out.println(i+"x9="+(i*9));
        }
        System.out.println("---------------------------------------");
        for (int a=1;a<=9;a++){
            if (a%3!=0){
                System.out.println(a+"x9="+(a*9));
            }
        }


    }
}
