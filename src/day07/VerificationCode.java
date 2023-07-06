package day07;

import java.util.Random;

/**
* 2.需求：随机生成N位验证码（大小写，数字）
* 训练目标：数组++随机数
* */

public class VerificationCode {
    public static String generateVeriCode(int len){
        String code="";
        Random ra=new Random();
        char []chs={'a','b','c','d','e','f','g','h','i','j','k',
                'l','m','n','o','p','q','r','s','t','u','v',
                'w','x','y','z','A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N','O','P','Q','R',
                'S','T','U','V','W','X','Y','Z','0','1','2',
                '3','4','5','6','7','8','9'};
        for (int i=0;i<len;i++){
            int index= ra.nextInt(chs.length);
            code+=chs[index];
        }
        /*

        */

        return code;

    }
    public static void main(String[] args) {
        String code=generateVeriCode(6);
        System.out.println("验证码是"+code);
    }
}
