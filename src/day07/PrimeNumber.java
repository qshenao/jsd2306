package day07;

import java.util.Scanner;

/**
 * 3,需求：找到2到100之间的所有素数（质素）
 * 素数是只能被1和它本身整除的数
 * 训练目标：通过Boolean的flag打标机
 * */

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        int num=1995652619;
        boolean flag=true;
        for (int i=2;i<num/2;i++) {
            if (num % i == 0) {
                flag = false;
                break;

            }
        }
            if (flag){
                System.out.println("是"+num);
            }else {
                System.out.println("不是"+num);
            }
*/
        for (int num=2;num<=100;num++){
            boolean flag2=true;
            for (int i=2;i<num/2;i++){
                if (num%i==0){
                    flag2=false;
                    break;
                }
            }
            if (flag2){
                System.out.print(num+"\t");
            }
        }




        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 2; i < n; i++) {
            boolean flag1 = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag1 = false;
                    break;
                }
            }
            if (flag1) {
                System.out.println("素数为 " + i);
            }
        }



}








}