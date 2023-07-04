package day04;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num= sc.nextInt();
        switch (num){
            case 1:
                System.out.println(111);
                break;
            case 2:
                System.out.println(222);

            case 3:
                System.out.println(333);
            default:
                System.out.println(444);
        }
    }
}
