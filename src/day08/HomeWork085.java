package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**设计方法生成整型数组并填充随机数据，元素个数不能写死，随机数最大值不能写死，并调用
*
 *       ------------------------------------------------------------------------------------------参见day06的MethodDemo
*
 *       N位评委打分，计算去掉最高分和最低分之后的平均分----------------参见day07的CalTotalAvg
**/
public class HomeWork085 {
    public static int[] Num(int len,int max){
      Random ra=new Random();
      int[]arr=new int[len];
      for (int i=0;i<arr.length;i++){
          arr[i]= ra.nextInt(max);
      }
      return arr;

    }
    public static double[]Prime(int num){
        double []scores=new double[num];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< scores.length;i++){
            System.out.println("请输入第"+(i+1)+"评委的分数");
            scores[i]= sc.nextDouble();
        }
        return scores;

    }
    public static double Total(double scores[]){
        double total = 0.0;
        Arrays.sort(scores);
        for (int i = 1; i < scores.length - 1; i++)
        {
            total += scores[i];
        }
        double avg = total / (scores.length - 2);
        return avg;

    }
    public static void main(String[] args) {
        int []arr=Num(10,30);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        double[] scores = Prime(10);
        double avg = Total(scores);
        System.out.println("平均分：" + avg);




    }

}
