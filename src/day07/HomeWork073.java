package day07;

import java.util.Scanner;

/**
 * 需求:
 * 机票价格按照季节(淡季、旺季)、舱位(头等舱、商务舱、经济舱)收费
 * 要求:
 * 输入机票原价、月份和舱位，实现不同的折扣
 * ---旺季(5月到10月)时，头等舱9折，商务舱85折，经济舱8折
 * ---淡季(11月到来年4月)时，头等舱7折，商务舱65折，经济舱6折
 * 训练目标: 分支结构
 */
public class HomeWork073 {
    public static double price1(double price, int month, int type) {
        double price1 = 0.0;
        if (price < 0) {
            System.out.println("机票价格错误");
            return -1;

        }
        if (month < 1 | month > 12) {
            System.out.println("月份选择错误");
            return -1;
        }

        if (type < 1 || type > 3) {
            System.out.println("舱位选择错误");
            return -1;
        }
        switch (month) {
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
                switch (type) {
                    case 1:
                        price1 = price * 0.7;
                        break;
                    case 2:
                        price1 = price * 0.65;
                        break;
                    case 3:
                        price1 = price * 0.6;
                        break;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                switch (type) {
                    case 1:
                        price1 = price * 0.9;
                        break;
                    case 2:
                        price1 = price * 0.85;
                        break;
                    case 3:
                        price1 = price * 0.8;
                        break;
                }
        }
        return price1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("机票的原价格");
        double price = sc.nextDouble();
        System.out.println("月份");
        int month = sc.nextInt();
        System.out.println("舱位的选择：1.商务舱，2.商务舱，3.经济舱");
        int type = sc.nextInt();
        double price1 = price1(price, month, type);
        if (price1 != -1) {
            System.out.println("机票的最终价格：" + price1 + "元");
        }

    }
}
