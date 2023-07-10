package day08;

import java.util.Arrays;

public class HomeWork0816 {
    public static void main(String[] args) {
        int temp[] = new int[5];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (int) (Math.random() * 10 + 1);
            for (int j=0;j<i;j++){
                if (temp[i]==temp[j]){
                    i-=1;
                    break;
                }
            }
            System.out.println(Arrays.toString(temp));
        }
        System.out.println(Arrays.toString(temp));
        }


    }

