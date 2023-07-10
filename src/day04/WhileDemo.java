package day04;

public class WhileDemo {
    public static void main(String[] args) {
     /* int count,sum;
      for (count=0,sum=0;count<3;count++){
          sum+=count;


      }
        System.out.println("跑了"+sum+"圈");
      int time=0;
      while(time<5){
          time++;
          System.out.println("行动是成功的阶梯");
      }
      int i,sum1;
      for (i=1; i<=9; i++){
          sum1=i*9;
          System.out.println(i+"*9"+"="+sum1);
      }

      */
        int time=0;
        while (time<5){
            System.out.println("行动是成功的阶梯");
            time++;

        }
        System.out.println("继续执行...");
        /*
        1.time=0；输出"行动是成功的阶梯"
        2.time=1 输出"行动是成功的阶梯"
        3.time=2；输出"行动是成功的阶梯"
        4.time=3；输出"行动是成功的阶梯"
        5.time=4；输出"行动是成功的阶梯"
        5.time=5;false循环结束；输出"继续执行..."

        */
        int i=1;
        while (i<=9){
            System.out.println(i+"*9="+i*9);
            i+=2;
        }
        /*
        1.i=1；输出1*9=9
        2.i=3；输出3*9=27
        3.i=；输出5*9=45
        4.i=7；输出7*9=63
        5.i=9；输出9*9=81
        6.i=11 false循环结束；
         */

    }

}
