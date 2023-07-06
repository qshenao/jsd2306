package basic;

import java.util.Scanner;

public class day01dome01 {
    public static void main(String[] args) {
        //
        String name="刘承俊";
        char sex='男';
        int age=21;
        int salary=6000;
        System.out.println("他的名字"+name+"，性别"+sex+","+age+"岁，"+salary+"元");

        int a=300000000;
        long sum=a*60L*60*24;
        System.out.println(sum);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两位数字");
        int num= sc.nextInt();
        System.out.println("请输入两位数字");
        int a1=num/10;int b1=num%10;
        System.out.println(""+a1+"  "+""+b1);

        for (int i=0;i<=100;i++){
            if (i%10==7||i%10==5||i%10==3)
                System.out.println(i);
        }




    }
}
