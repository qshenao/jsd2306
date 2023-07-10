package day08;
/**
 * 求数组元素最大值，并放在最后一个元素的下一个位置-参见day06的MaxOfArray
 * 使用Arrays.sort()对arr数组升序排列参见day05的ArrayDemo
 *  生成N位验证码参见day07的VerificationCode
 **/
import java.util.Arrays;
import java.util.Random;

public class HomeWork084 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("最大值为:"+max);
        arr= Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=max;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------");
        System.out.println();
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        String yzm=yzm(6);
        System.out.println(yzm);

    }
public static String yzm(int len){
        String yzm="";
        Random ra=new Random();
        char[]yzm1={'a','b','c','d','e','f','g','h','i','j','k',
                'l','m','n','o','p','q','r','s','t','u','v',
                'w','x','y','z','A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N','O','P','Q','R',
                'S','T','U','V','W','X','Y','Z','0','1','2',
                '3','4','5','6','7','8','9'};
        for (int i=0;i<len;i++){
            int index= ra.nextInt(yzm1.length);
            yzm+=yzm1[index];

        }
        return yzm ;

}
}
