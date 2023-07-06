package day06;

import java.util.Random;

//定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法
//定义一个printArrayData()，用于输出整型数组的每一个元素的值，测试方法
public class HomeWork062 {
    public static int[] getMaxOfArray(int len,int max){
        int num[]=new int[len];
        Random ra=new Random();
        for (int i=0;i<num.length;i++){
            num[i]=ra.nextInt(max);
        }
        return num;
    }
    public static int[] printArrayData(int len,int max){
        int num1[]=new int[len];
        Random ra=new Random();
        for (int i=0;i<num1.length;i++){
            num1[i]=ra.nextInt(max);
        }
        return num1;
    }
    public static void main(String[] args) {
        int num[]=getMaxOfArray(10,10);
        int max=num[0];
        for (int i=0;i<num.length;i++){
            if (num[i]>max){
                max=num[i];
            }
            System.out.println(num[i]);

        }
        System.out.println("最大值"+max);

        System.out.println("----------------------------------");
        int num1[]=getMaxOfArray(10,100);

        for (int i=0;i<num1.length;i++) {

            System.out.println(num[i]);
        }


    }
}
