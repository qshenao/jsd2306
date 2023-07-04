package day04;

public class ForDemo {
    public static void main(String[] args) {
        int time;
        for (time=0;time<5;time++){
            System.out.println("行动是成功的阶梯");
        }
        /*
        * 1.time=0 输出
        * 2.time=1 输出
        * 3.time=2 输出
        * 4.time=3 输出
        * 5.time=4 输出
        * 6.time=5 False 循环结束
        **/
        int i,sum;
        for (i=1; i<=9; i++){
            sum=i*9;
            System.out.println(i+"*9="+sum);
        }
        System.out.println("-------------------------------------");
        /*
        * 1.i=1，sum=9 输出9
        * 2.i=2，sum=18 输出18
        * 3.
        * 4.
        * 5.
        * 6.
        * 7.
        * 8.
        * 9.
        * 10.i=10，sum=90 False 循环结束*/
        int a,j;
        for (a=1;a<10;a++){
            for (j=1;j<=a;j++){

                System.out.print(j+"×"+a+"="+a*j+"\t");
            }
            System.out.println();

        }
        System.out.println("-------------------------------------");

        int count,sum3;
        for (count=1,sum3=0;count<=100;count++){
            sum3+=count;
        }
        System.out.println("sum3"+sum3);



    }
}
