package day08;

import java.util.Arrays;
import java.util.Random;

/**
 * 向一个长度为5的整型数组中随机生成5个1-10的随机整数
 * 要求生成的数字中没有重复数!
 * */
public class HomeWork0815 {
    public static void main(String[] args) {

        int[] num = new int[10];
        Random ra = new Random();

        for (int i = 0; i < num.length; i++) {
            int Num1;
            boolean isDuplicate;

            do {
                Num1 = ra.nextInt(10) + 1;
                isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (num[j] == Num1) {
                        isDuplicate = true;
                        break;

                    }
                }
            } while (isDuplicate);

            num[i] = Num1;
        }

        System.out.println("Random unique array: " + Arrays.toString(num));
    }
}


