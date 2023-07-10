package day08;

import java.util.Scanner;

/**
分支结构的练习：

        if结构：-------------------------------------------------参见day03的IfDemo

        判断成绩是否合法

        if...else结构：-----------------------------------------参见day03的IfElseDemo

        满500打8折，不满500打9折

        if...else if结构：---------------------------------------参见day03的IfElseIfDemo

        满2000打5折，满1000不满2000打7折，满500不满1000打8折，不满500打9折

        switch...case结构：----------------------------------参见day04的CommandBySwitch

        命令解析程序

        综合：----------------------------------------------------参见day07的CalAirPrice

        机票按照季节、舱位打折

        循环结构的练习：

        while结构：---------------------------------------------参见day07的Guessing

        while自造死循环版猜数字小游戏

        do...while结构：---------------------------------------参见day04的Guessing

        while版猜数字小游戏

        for结构：

        计算1到100的累加和----------------------------参见day04的ForDemo

        随机加法运算器-----------------------------------参见day05的Addition

        嵌套循环：

        九九乘法表------------------------------------------参见day05的MultiTable

        统计2到100之内的所有素数--------------------参见day07的VerificationCode

        数组的练习：

        求数组元素最大值，并放在最后一个元素的下一个位置---------------参见day06的MaxOfArray

        使用Arrays.sort()对arr数组升序排列----------------------------------------参见day05的ArrayDemo

        生成N位验证码---------------------------------------------------------------------参见day07的VerificationCode

        方法的练习：

        设计方法生成整型数组并填充随机数据，元素个数不能写死，随机数最大值不能写死，并调用

        ------------------------------------------------------------------------------------------参见day06的MethodDemo

        N位评委打分，计算去掉最高分和最低分之后的平均分----------------参见day07的CalTotalAvg



        二. 扩展：-------------选练
        平年、闰年的判断----------------------------------------------------------------------------------参见day03扩展练习2

        接收用户输入的年份year和月份month，计算该年该月的天数，并输出----------参见day04扩展练习2

        打印字符*组成的直角三角形，输出结果如下所示：-------------------------------------参见day05扩展练习3

        *
        ***
        *****
        *******
        *********
        ***********
        定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法

        ---------------------参见day06扩展练习1
 */
public class HomeWork081 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个分数");
        double score= sc.nextDouble();
        if (score>=0&&score<=100){
            System.out.println("分数正确为有效值");

        }else {
            System.out.println("分数不正确请重新输入");

        }
        System.out.println("请输入一个价格");
        double price=sc.nextDouble();
        if (price>500){
            price*=0.8;
            System.out.println(price);
        }else {
            price*=0.9;
            System.out.println(price);
        }
        System.out.println("请输入一个商品的价格");
        double price1=sc.nextDouble();
        if (price1>=2000){
            price1*=0.5;
            System.out.println(price1);
        }else if (price1>=1000){
            price1*=0.7;
            System.out.println(price1);

        }else if (price1>=500){
            price1*=0.8;
            System.out.println(price1);
        }else {
            price1*=0.9;
            System.out.println(price1);
        }
        System.out.println("原机票价格");
        double price2=sc.nextDouble();
        System.out.println("月份选择");
        int month= sc.nextInt();
        System.out.println("舱位的选择：1.头等舱，2.商务舱，3.经济舱");
        int type=sc.nextInt();
        double finalPrice=CalAirPrice(price2,month,type);
        if (finalPrice!=-1){
            System.out.println("最终价格："+finalPrice);
        }
        System.out.println("自动取款机的业务：1.存款，2.取款，3查询余额，4退卡");
        int command= sc.nextInt();
        switch (command){
            case 1:
                System.out.println("存款");
                break;
            case 2:
                System.out.println("取款");
                break;
            case 3:
                System.out.println("查询余额");
                break;
            case 4:
                System.out.println("天空");
                break;
            default:
                System.out.println("输入错误");

        }



    }
    public static double CalAirPrice(double price,int month,int type){
        double finalPrice=0.0;
        if (price<0){
            System.out.println("价格错误");
            return 1;

        }
        if (month<1||month>12) {
            System.out.println("月份错误");
            return -1;
        }
        if (type<1||type>3){
            System.out.println("舱位错误");
            return -1;
        }
        if (month>=5&&month<=10){
            switch (type){
                case 1:
                    price*=0.9;
                    break;
                case 2:
                    price*=0.85;
                    break;
                case 3:
                    price*=0.8;
                    break;
            }
        }else {
            switch (type){
                case 1:
                    price*=0.7;
                    break;
                case 2:
                    price*=0.65;
                    break;
                case 3:
                    price*=0.6;
                    break;
            }

        }
        finalPrice=price;

        return finalPrice;
    }
}
