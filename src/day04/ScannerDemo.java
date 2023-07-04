package day04;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year= sc.nextInt();
        System.out.println("年份是："+year);
        double price= sc.nextDouble();
        System.out.println("价格是："+price);



    }
}
