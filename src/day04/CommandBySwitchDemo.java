package day04;

import java.util.Scanner;

public class CommandBySwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择功能：1.存款，2.取款，3查询余额，4退卡");
        int command= sc.nextInt();
        switch (command){
            case 1:
                System.out.println("存款业务");
                break;
            case 2:
                System.out.println("取款业务");
                break;
            case 3:
                System.out.println("查询余额业务");
                break;
            case 4:
                System.out.println("退卡...");
                break;
            default:
                System.out.println("输入错误请重新输入");
        }
    }
}
