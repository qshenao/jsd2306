package day04;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
       /*
        Scanner sc=new Scanner(System.in);
        int num=(int)(Math.random()*1000+1);
        System.out.println(num);
        System.out.println("猜吧");
        int guess= sc.nextInt();
        do {if (guess>num){
            System.out.println("猜大了");
        }
            else{
            System.out.println("猜小了");
        }
            System.out.println("继续猜");
            guess= sc.nextInt();

        }while (guess!=num);
        System.out.println("猜成功了");


        */
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 1000 + 1);
        System.out.println(num);
        int guess;
        do {
            System.out.println("猜吧");
            guess = sc.nextInt();

            if (guess>num) {
                System.out.println("猜大了");

            } else if (guess<num) {
                System.out.println("猜小了");
            }
        } while (guess != num);
        System.out.println("猜对了");
    }
}

