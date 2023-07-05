package day05;

import java.util.Scanner;

//随机加法运算器
public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score ,i;
        for (score=0,i=1;i<=10;i++){

            int num1=(int)(Math.random()*100);
            int num2=(int)(Math.random()*100);
            int sum=num1*num2;
            System.out.println("("+i+")"+num1+"x"+num2+"=?");
            int answer=sc.nextInt();
            if (sum==answer){
                System.out.println("回答正确");
                score+=10;
            }else{
                System.out.println("回答错误");
            }


        }
        System.out.println("总分"+score);

    }
}
