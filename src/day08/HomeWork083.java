package day08;

import java.util.Random;
import java.util.Scanner;

//循环结构：
public class HomeWork083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("猜一个数字");
        int num = ra.nextInt(100);
        System.out.println(num);
        while (true) {
            System.out.println("猜吧");
            int num1 = sc.nextInt();
            if (num1 > num) {
                System.out.println("大了");
            } else if (num1 < num) {
                System.out.println("小了");
            } else {
                System.out.println("对了");
                break;
            }

        }
        System.out.println("-----------------------------------");
        System.out.println("猜一个数");
        int num2 = ra.nextInt(1000);
        System.out.println(num2);
        do {
            System.out.println("猜吧");
            int num3 = sc.nextInt();
            if (num3 > num2) {
                System.out.println("大了");
            } else if (num3 < num2) {
                System.out.println("小了");
            } else {
                System.out.println("对了");
                break;
            }

        } while (true);
        int sum = 0;
        System.out.println("-------------------------------");
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("---------------------------------");
        int score = 0;
        for (int i = 1; i <= 10; i++) {
            int a = ra.nextInt(100);
            int b = ra.nextInt(100);
            int sum1=a+b;
            System.out.println("(" + i + ")" + a + "+" + b + "=?");
            int answer = sc.nextInt();
            if (sum1 == answer) {
                System.out.println("回答正确");
                score += 10;
            } else {
                System.out.println("回答错误");
            }

        }
        System.out.println("总分" + score);

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i + "x" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;

                }
            }
            if (flag) {
                System.out.print(i + "\t");
            }

        }
    }
 }

