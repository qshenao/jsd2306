package day05;

import java.util.Arrays;

/*1. Addition随机加法运算器

   要求：由系统随机出10道加法题，而后由用户来答题，答题后输出"答对了"或"答错了"，答对1题得10分，答错1题不扣分，最后输出总分数。

2. MultiTable九九乘法表

   要求：输出九九乘法表

3. 数组小代码练习：声明、初始化、访问、遍历

4. MaxOfArray求数组元素最大值

5. 对数组进行升序排列，并输出排序后的结果*/
public class HomeWork051 {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        int score=0;
        for (int i=0;i<10;i++){
            int num=(int)(Math.random()*100+1);
            int num1=(int)(Math.random()*100+1);
            System.out.println(num+"+"+num1);
            int sum= sc.nextInt();
            System.out.println(num+"+"+num1+"="+(num+num1));

            if (sum==(num1+num)){
                System.out.println("回答正确");
                score+=10;
            }else {
                System.out.println("回答错误");
            }

        }
        System.out.println("总分："+score);

         */
        /*
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

         */
        /*

        //MaxOfArray求数组元素最大值
        int []a=new int[10];
        for (int i=0;i<a.length;i++){
            int count=(int)(Math.random()*100+1);
            a[i]=count;

            System.out.println(a[i]);
        }
        int max=a[0];
       for (int i=0;i<=9;i++){

           if (a[i]>max){
               max=a[i];
           }
       }
        System.out.println("最大值："+max);

         */
        //对数组进行升序排列，并输出排序后的结果

        int[] a = new int[10];
        for (int i = 0; i <= 9; i++) {
            int num = (int) (Math.random() * 100 + 1);
            a[i] = num;
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        System.out.println("升序后");
        for (int i = 0; i <= 9; i++) {
            System.out.println(a[i]);
        }

    }
}
