package day06;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        /*
        //a:源数组

        //1:源数组的起始下标
        //b:目标数组
        //0:目标数组的起始下标
        //4:要复制的元素个数/*
        //灵活性好

        int []a={10,20,30,40,50};
        int []b=new int[6];
        System.arraycopy(a,1,b,1,2);
        for (int i=0;i<b.length;i++)
            System.out.println(b[i]);
        System.out.println("--------------------------------");
        System.arraycopy(a,0,b,0,5);
        for (int i=0;i<b.length;i++)
            System.out.println(b[i]);
        System.out.println("--------------------------------");
        System.arraycopy(a,2,b,0,2);
        for (int i=0;i<b.length;i++)
            System.out.println(b[i]);
        System.out.println("--------------------------------");
        System.arraycopy(a,3,b,5,1);
        for (int i=0;i<b.length;i++)
            System.out.println(b[i]);


         */
        /*
        * //a:源数组
        //b:目标数组
        //6:目标数组的长度
        //  --若目标数组长度>源数组长度，则末尾补默认值
        //  --若目标数组长度<源数组长度，则将末尾的截掉
        * //灵活性差*/
        int[]a={10,25,320,2510,155};
        int[]b= Arrays.copyOf(a,8);
        for (int j : b) System.out.println(j);



    }

}
