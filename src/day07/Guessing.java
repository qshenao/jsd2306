package day07;

import java.util.Scanner;

/**
 * 1.需求：猜数字小游戏
 *  训练目标：while（ture）自造死循环+break
 */
public class Guessing {
    public static void main(String[] args) {
            /*
            Scanner sc=new Scanner(System.in);
            int num= (int)(Math.random()*100+1);
            System.out.println(num);
            while(true){
                System.out.println("猜吧");
                int guess= sc.nextInt();
                if (guess>num){
                    System.out.println("太大了");

                } else if (guess<num) {
                    System.out.println("太小了");
                }else {
                    System.out.println("猜对了");
                    break;
                }
            }

             */

            Scanner sc=new Scanner(System.in);
            int num1=(int)(Math.random()*100+1);
        System.out.println(num1);
        while (true){
            System.out.println("猜呀");
            int guess= sc.nextInt();
            if (num1<guess){
                System.out.println("大了");
            } else if (num1>guess) {
                System.out.println("小了");

            }else {
                System.out.println("对了");
                break;
            }
        }










    }
}
