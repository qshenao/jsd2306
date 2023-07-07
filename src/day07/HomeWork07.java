package day07;

import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=(int)(Math.random()*100+1);
        System.out.println(num1);
        while (true) {
            System.out.println("猜呀");
            int guess = sc.nextInt();
            if (num1 < guess) {
                System.out.println("大了");
            } else if (num1 > guess) {
                System.out.println("小了");

            } else {
                System.out.println("对了");
                break;
            }
        }

    }
}