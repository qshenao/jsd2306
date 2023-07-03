package day03;

public class IfElseDemo {
    public static void main(String[] args) {

        // x和y的关系满足如下：
        // x>=3 y = 2x + 1;
        // -1<=x<3 y = 2x;
        // x<=-1 y = 2x – 1;
        // 根据给定的x的值，计算出y的值并输出。

        // 定义变量
        int x = 5;

        /*
		int y;
		if (x >= 3) {
			y = 2 * x + 1;
		} else if (x >= -1 && x < 3) {
			y = 2 * x;
		} else if (x <= -1) {
			y = 2 * x - 1;
		}else {
			y = 0;
		}
        */

        int y = 0;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x >= -1 && x < 3) {
            y = 2 * x;
        } else if (x <= -1) {
            y = 2 * x - 1;
        }

        System.out.println("y的值是：" + y);

        int a = 5, b = 10;
        if (a == b) {
            System.out.println("ture");

        } else {
            System.out.println("fales");
        }


        double price=100.0;
        if (price>=500.0){
            price*=0.8;
            System.out.println(price);

        }else {
            price*=0.9;
            System.out.println(price);

        }
        System.out.println("最终消费金额："+price);
        //double score=65.3;
        double score=-9;
        if (score>=0 && score<=100){
            System.out.println(score+"成绩合法"  );

        }else {
            System.out.println(score+"成绩不合法");

        }
        System.out.println("结束");



    }
}
