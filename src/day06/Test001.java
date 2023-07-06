package day06;

import java.util.Random;

public class Test001 {
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
            }
        }


/*
* 定义say()无参无返回值方法，调用测试
定义say()有一个参无返回值方法，调用测试
定义say()有两个参无返回值的方法，调用测试
定义getNum()无参有返回值方法，演示return的用法，调用测试
定义plus()两个参有返回值方法，调用测试
定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试*/
