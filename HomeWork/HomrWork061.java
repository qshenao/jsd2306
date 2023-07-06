package day06;
/*
* MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置

要求：声明整型数组并填充随机数据，找到最大值，将数组扩容并将最大值放末尾

方法的练习：

要求：

定义say()无参无返回值方法，调用测试
定义say()有一个参无返回值方法，调用测试
定义say()有两个参无返回值的方法，调用测试
定义getNum()无参有返回值方法，演示return的用法，调用测试
定义plus()两个参有返回值方法，调用测试
定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试*/

import java.util.Arrays;
import java.util.Random;

public class HomrWork061 {
    public static void say(){
        System.out.println("大家好！");
    }
    public static void say(String name){
        System.out.println("大家好，我的名字是"+name);
    }
    public static void say(String name,int age){
        System.out.println("大家好，我的名字是"+name+"， "+age+"岁");
    }
    public static int getNum(int a, int b){
        int sum=a+b;
        return sum ;
    }
    public static int plus(int a,int b){
        int sum1=a*b;
        return sum1;
    }
    public static int[] generateArray(int len ,int max){
        int num[]=new int[len];
        Random ra=new Random();
        for (int i=0;i<num.length;i++){
            num[i]= ra.nextInt(max);
        }
        return num;

    }
    public static void main(String[] args) {
        say();
        say("张三");
        say("李四"+23);
        int sum=getNum(3,6);
        System.out.println(sum);
        int sum1=plus(123,456);
        System.out.println(sum1);
        int[] num=generateArray(10,10);
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }


        System.out.println("------------------------------------");




        int []arr=new int[10];
        Random ra=new Random();

        for (int i=0;i<=arr.length-1;i++){
            arr[i]= ra.nextInt(100);
            System.out.println(arr[i]);
        }
        System.out.println("------------------");
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                arr[i]=max;
            }
            System.out.println(arr[i]);
        }
        System.out.println("最大值是；"+max);
         arr= Arrays.copyOf(arr,arr.length+1);
         arr[arr.length-1]=max;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
