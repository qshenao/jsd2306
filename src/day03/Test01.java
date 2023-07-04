package day03;

import java.util.Scanner;


public class Test01 {
    public static void main(String[] args) {
        //声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现：条件运算符、if..else分支结构
        //1
        int a = 10, b = 15;
        int max = a > b ? a : b;
        System.out.println(max);

        //2
        int a1 = 10, b1 = 15;
        int max1;
        if (a1 > b1) {
            max1 = a1;
            System.out.println("max=" + max1);
        } else {
            max1 = b1;
            System.out.println("max=" + max1);
        }

        //声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年"。

        Scanner sc = new Scanner(System.in);

        System.out.println("请输出一个年份");
        int year = sc.nextInt();
       /* if (year / 400 == 0) {
            System.out.println("是闰年"+"闰年是;"+year);

        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("是闰年"+"闰年是;"+year);

        }else {
            System.out.println("不是闰年："+year);
        }

        */
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "是平年");
        }



        /*
        3. 成绩等级判断：

         > 注：考虑成绩的合法性：当不合法成绩时，输出"成绩不合法"

         ```java
          A:成绩大于等于90
          B:成绩大于等于80并且小于90
            C:成绩大于等于60并且小于80
             D:成绩小于60
             */

            System.out.println("请输出一个成绩");
            int score = sc.nextInt();
       /*if (score>=90&&score<=100){
            System.out.println("成绩为A，且合法");
        } else if (score>=80&&score<90) {
            System.out.println("成绩为B，且合法");

        } else if (score>=60&&score<80) {
            System.out.println("成绩为C，且合法");

        }else if (score>=0&&score<60){
            System.out.println("成绩为D，且合法");

        }else {
            System.out.println("成绩为不合法");
        }
        */

            //带数(888,-56,95,85,65,45)
            /*if (score < 0 || score > 100) {
                System.out.println("成绩不合法");
            } else if (score >= 90) { //合法
                System.out.println("A-优秀");
            } else if (score >= 80) {
                System.out.println("B-良好");
            } else if (score >= 60) {
                System.out.println("C-中等");
            } else {
                System.out.println("D-不及格");
            }

             */
            score=score/10;
            switch (score){
                case 0: case 1: case 2: case 3: case 4: case 5:
                    System.out.println("成绩为：D");
                    break;
                case 6: case 7:
                    System.out.println("成绩为：C");
                    break;
                case 8:
                    System.out.println("成绩为：B");
                case 9: case 10:
                    System.out.println("成绩为：A");
                    break;
                default:
                    System.out.println("成绩不存在请重新输入");
                    break;
            }


        }
    }

