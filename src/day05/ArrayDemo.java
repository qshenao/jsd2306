package day05;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        int []a=new int[]{10,1101,61,3216,13146,2152};
        int []a1={1,2,3,4,5,6,4,65,84};
        //声明一个整数类型的a的数组，包含10个元素，默认值为0
        double []b=new double[]{10.0,230.51,210.541,43140.64,4510.8134,412.05522};
        double []b1={5.01,0.264,1.05,0.165};
        //声明一个浮点型类型的b的数组，包含23个元素，默认值为0.0
        boolean []c=new boolean[26];
        //声明一个boolean的a的数组，包含26个元素，默认值为false
        char []d=new char[100];
        //声明一个整数类型的a的数组，包含10个元素，默认值为0
        System.out.println(a[0]);
        System.out.println(a1[1]);
        System.out.println(b[0]);
        System.out.println(b1[2]);
        System.out.println(c[0]);
        System.out.println(d[0]);
        System.out.println("数组的长度"+a.length);
        int arr[]=new int[3];
         arr[1]=100;
         arr[0]=32;
         arr[2]=652;
        System.out.println(arr[arr.length-2]);


         */

/*
        int a[]=new int[100];
        for (int i=0;i<=(a.length-1);i++){
            a[i]=(int)(Math.random()*99+1);
            System.out.println(a[i]);
        }
        int arr[]=new int[10];
        for (int i=0;i<(arr.length);i++){
            arr[i]=100;
            System.out.println(arr[i]);
        }

 */
        int arr[]=new int[10];
        Random ra=new Random();

        for (int i=0;i<arr.length;i++){
            arr[i]= ra.nextInt(100);
            System.out.println(arr[i]);
        }
        System.out.println("升序后");
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("降序后");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }


    }
}
