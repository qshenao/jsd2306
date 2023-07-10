package day08;

import java.util.Arrays;
import java.util.Random;

/**
 * 向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
 *  *  1)升序输出、降序输出
 *  *   2)输出总和、平均数
 * */
public class HomeWork0814 {
    public static void main(String[] args) {
        Random ra=new Random();
        int[]arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]= ra.nextInt(10);
            System.out.println(arr[i]);
        }
        System.out.println("升序后");
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        System.out.println("降序后");

        for (int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
        int sum=0;
        double avg=0.0;
        for (int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/(arr.length);
        System.out.println("和："+sum);
        System.out.println("平均值："+avg);
    }
}
