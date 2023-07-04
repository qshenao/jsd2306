package day04;

import java.util.Scanner;

//接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
//2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
//4. 输出1900到2023年之间所有的闰年(每够10个年份，换一行
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("请输入一个整数");
        int num= sc.nextInt();
        if (num>0){
            System.out.println("是正数");
        } else if (num<0) {
            System.out.println("是负数");
        } else if  (num==0) {
            System.out.println("是0");
        }

         */
        /*
        System.out.println("请输入年份：和月份：");
        int year= sc.nextInt();
        int month=sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("月份为31天");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("月份为30天");
                break;
            case 2:
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println("是闰年,月份为29天");
            }else {
                System.out.println("是平年，月份为28天");
            }
            break;

        }
        */
        //输出1900到2023年之间所有的闰年(每够10个年份，换一行)
        int year, count;
        for (year = 1900, count = 0; year <= 2023; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                count++;
                System.out.println(year);
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}









