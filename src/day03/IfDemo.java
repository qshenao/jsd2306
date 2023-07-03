package day03;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {


                System.out.println("开始");
                // 定义两个变量
                int a = 10;
                int b = 20;

                if (a == b) {
                    System.out.println("a等于b");
                }else {
                    System.out.println("a不等于b");
                }

                int c = 10;
                if (a == c) {
                    System.out.println("a等于c");
                }

                System.out.println("结束");


        double price = 300.0; //消费金额  带数(600.0,300.0)
        if(price>=500){ //满500
            price *= 0.8; //打8折
        }
        System.out.println("最终消费金额为:"+price);

        //2)判断成绩是否合法:
        int score = -9; //成绩  带数(95,950,-9)
        if(score>=0 && score<=100){
            System.out.println("成绩合法");
        }
        System.out.println("继续执行...");
    }
}
