package day07;

import java.util.Scanner;

/**
 * 4.需求：机票价格按照季节（淡季旺季），舱位（头等舱，商务舱，经济舱）收费
 * 要求
 * 输入机票价格，月份和舱位，实现不同折扣
 * --旺季（5月到10月）时，头等舱0.9，商务舱0.85经济舱0.8
 * --淡季（11月到4月）时，头等舱0.7，商务舱0.65经济舱0.6
 * 训练目标 ：分支结构
 */

public class CalAirPrice {
    public static double calFinalPrice(double price, int month, int type) {
        double finalPrice = 0.0; //最终价格
        if (price < 0) {
            System.out.println("机票输入错误");
            return -1;
        }
        if (month < 1 || month > 12) {
            System.out.println("月份输入错误");
            return -1;
        }
        if (type < 1 || type > 3) {
            System.out.println("舱位输入错误");
            return -1;
        }
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                switch (type) {
                    case 1:
                        finalPrice = price * 0.7;
                        break;
                    case 2:
                        finalPrice = price * 0.65;
                        break;
                    case 3:
                        finalPrice = price * 0.6;
                        break;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                switch (type) {
                    case 1:
                        finalPrice = price * 0.9;
                        break;
                    case 2:
                        finalPrice = price * 0.85;
                        break;
                    case 3:
                        finalPrice = price * 0.8;
                        break;
                }
                break;
        }
        return finalPrice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价格");
        double price = sc.nextDouble();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请选择舱位：1.头等舱。2.商务舱。3.经济舱");
        int type = sc.nextInt();
        double finalPrice = calFinalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("机票的最终价格：" + finalPrice + "元");
        }
    }
}
