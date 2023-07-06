package day06;

import java.util.Arrays;
import java.util.Random;

public class MethDemo {
    public static int[] generateArray(int len,int max){
        Random ra=new Random();
        int []arr=new int[len];
        for (int i=0;i<arr.length;i++){
            arr[i]= ra.nextInt(max);
        }
        return arr;
    }


public static void say(String name,int age){
        if(age>=50){
            return;
        }
    System.out.println("姓名是："+name+", "+age+"岁");
}
public static void say(){
    System.out.println("???");

}
public static void say(String name,int age,char sex){
    System.out.println("姓名是："+name+", "+age+"岁"+", "+"性别："+sex);

}
public static void say(String name,int age,char sex,double height){
    System.out.println("姓名是："+name+", "+age+"岁"+", "+"性别："+sex+", 身高："+height);

}




    public static void main(String[] args) {


       say();
       say("kbk",25);
       say("kind",25,'男');
       say("iuibihboi",26,'男',178.5);










        int []a=generateArray(100,101);
        System.out.println("数组长度："+a.length);
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
        int []b=generateArray(200,312);
        System.out.println("第一个数组："+b[0]);
        for (int i=0;i< b.length;i++){
            System.out.println(b[i]);
        }
        int []c=generateArray(200,201);
        Arrays.sort(c);
        System.out.println("升序后数组");
        for (int i=0;i< c.length;i++){
            System.out.println(c[i]);
        }





        /*
        int c=plus(1,3);
        System.out.println(c);
        double c1=num(1.0,2.3);
        System.out.println(c1);
        int m=5,n=9;
        int c2=plus(m,n);
        System.out.println(c2);
        int m1=10,n1=382;
        int c3=plus(m1,n1);
        System.out.println(c3);

       say("dark",2);//name，age为实际参数
        say("gradle",62);//name，age为实际参数
        say("json",3);//name，age为实际参数
        num(13,13);//a，b实际参数
        nun1(12,456);//i，b实际参数
        num2();
        double a=num2();
        System.out.println("a="+a);

         */


    }

    /*
    public static double num3(){
        return 0;
    }
    public static int plus(int a,int b){
        int c=a+b;
        return c;
    }
    public static double num(double a,double b){
        double c1=a+b;
        return c1;
    }*/
    /*
    public static void say(String name,int age){//say为形式参数

        System.out.println("名字是"+name+","+age+"岁");


    }
    public  static void num(int a,int b){//num 为形式参数

        int a1= a + b;
        System.out.println(a1);
        int a2=a*b;
        System.out.println(a2);

    }
    public static int nun1( int i,int b ){//num1 为形式参数

        int a1=i+b;
        System.out.println(a1);
        return 0;
    }
    public static double num2(){
        double a=123.02,b=a+256.23,c;
        c=a+b;
        System.out.println("c="+c);

        return  0;

    }

     */
}


