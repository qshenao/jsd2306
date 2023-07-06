package day06;

import java.util.Random;

public class HomeWork063 {
    public static void main(String[] args) {
        int[] arr = {23,36,74,84,2,4};
        printArrayData(arr);

        Random rand = new Random();
        int[] as = new int[10];
        for(int i=0;i<as.length;i++){
            as[i] = rand.nextInt(100);
        }
        printArrayData(as);
    }
    public static void printArrayData(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        say();
        say("kind");
        say("alpha","roadhouse");
        double a=getNum();
        System.out.println(a);
        int c=plus(3,5);
        System.out.println(c);
        int []num= generateArray(10,21);
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    public static void say(){
        System.out.println("晚上好！");
    }
    public static void say(String name){
        System.out.println("晚上好！"+name);
    }
    public static void say(String name,String day){
        System.out.println("晚上好！"+name+"socket"+day);
    }
    public static double getNum(){

        return 8.0;
    }
    public static int plus(int a,int b){
        int c=a+b;
        return c;
    }
    public static int[] generateArray(int len,int max){
        Random ra=new Random();
        int []num=new int[len];
        for (int i=0;i<num.length;i++){
            num[i]= ra.nextInt(max);
        }
        return num;

    }
}
/*
* 定义say()无参无返回值方法，调用测试
定义say()有一个参无返回值方法，调用测试
定义say()有两个参无返回值的方法，调用测试
定义getNum()无参有返回值方法，演示return的用法，调用测试
定义plus()两个参有返回值方法，调用测试
定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试*/