package day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=(int)(Math.random()*100000+1);
        System.out.println( "要猜的数字"+num);
        System.out.println("猜数");
        int guess = sc.nextInt();
        while (guess!=num){

            if (guess>num){
                System.out.println("猜大了");
            } else  {
                System.out.println("猜小了");

            }
            System.out.println("继续猜吧");
            guess=sc.nextInt();
        }
        System.out.println("猜数字成功了！");
    }
}
