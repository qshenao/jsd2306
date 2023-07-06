package day04;

public class HomeWork041 {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请选择功能: 1.取款  2.存款  3.查询余额  0.退卡");
        int command= sc.nextInt();
        switch (command){
            case 1:
                System.out.println("取款操作...");
                break;
            case 2:
                System.out.println("存款操作...");
                break;
            case 3:
                System.out.println("查询余额操作...");
                break;
            case 4:
                System.out.println("退出成功");
                break;
            default:
                System.out.println("输出错误请重新操作");

        }*/

        /*
        Scanner sc=new Scanner(System.in);
        int num=(int) (Math.random()*10000+1);
        System.out.println(num);
        System.out.println("猜吧");
        int guess= sc.nextInt();
        while (guess!=num){
            if (guess>num){
                System.out.println("猜大了");

            }else {
                System.out.println("猜小了");
            }
            System.out.println("继续猜");
            guess= sc.nextInt();


        }
        System.out.println("猜对了");



        Scanner sc=new Scanner(System.in);
        int num=(int) (Math.random()*10000+1);
        System.out.println(num);

        int guess;
        do {
            System.out.println("猜吧");
            guess= sc.nextInt();


            if (guess>num){
                System.out.println("猜大了");

            } else if (guess<num) {
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
            }

        }while (guess!=num);
      */
        int time;
        for (time=0;time<5;time++){
            System.out.println("0000");
        }
        int i,j;
        for (i=1; i<=9; i++) {
            for (j = 1; j <= i; j++) {

                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }





    }
}
