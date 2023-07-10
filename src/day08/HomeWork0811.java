package day08;

import java.util.Random;
import java.util.Scanner;

/**
 * 平年、闰年的判断----------------------------------------------------------------------------------参见day03扩展练习2
 *
 * 接收用户输入的年份year和月份month，计算该年该月的天数，并输出----------参见day04扩展练习2
 *
 * 打印字符*组成的直角三角形，输出结果如下所示：-------------------------------------参见day05扩展练习3
 *
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * 定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法
 *
 * ---------------------参见day06扩展练习1*/

public class HomeWork0811 {
    public static int getMaxOfArray(int[] arr){
        Random ra=new Random();
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个年份判断是否为平年闰年");
        int year= sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("是闰年");
        }else {
            System.out.println("是平年");
        }
        System.out.println("------------------------------------------------------");
        System.out.println("请输入一个年份");
        int year1= sc.nextInt();
        System.out.println("请输入一个月份");
        int month=sc.nextInt();
        if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0){
            System.out.println("是闰年");
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("这个月有31天");
                case 4: case 6: case 9: case 11:
                    System.out.println("这个月有30天");
                case 2:
                    System.out.println("这个月有29天");
            }
        }else {
            System.out.println("是平年");
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("这个月有31天");
                case 4: case 6: case 9: case 11:
                    System.out.println("这个月有30天");
                case 2:
                    System.out.println("这个月有28天");
            }
        }

        for (int i=1;i<=6;i++){
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int arr[]={123,5161,4641,4646,464161,491461};
        int max = getMaxOfArray(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                arr[i]=max;

            }
        }
        System.out.println("最大值；"+max);


    }
}
