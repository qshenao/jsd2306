package day07;

import java.util.Scanner;

/**
 *5.需求<<主持人>>有N位评委给选手评分，分数在0-100之间的浮点数
 *      选手的最终分：去掉最高分和最低分之后的N-2位评委的平均分
 *    训练目标：方法的设计
 * */

public class CalTotalAvg {
    public static double []inputData(int count){
        double[] scores=new double[count];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"评委的分数");
            scores[i]= sc.nextDouble();
        }
        return scores;
    }

    public static double calAvg(double[] scores){
        double avg=0.0;
        double total=0.0;
       // Arrays.sort(scores);
        double max=scores[0];
        double min=scores[0];
        for (int i=0;i<scores.length;i++){
           if (scores[i]>max){
               max=scores[i];
           }
           if (scores[i]<min){
               min=scores[i];
           }
           total+=scores[i];
        }
        avg=(total-max-min)/(scores.length-2);
        return avg;
    }
    public static void main(String[] args) {
        double []scores=inputData(6);
        double avg=calAvg(scores);
        System.out.println("平均分："+avg);

    }
}
