package day07;
/** 需求:---------常见面试题
        *   找到2到100之间的所有素数(质数)
        *   素数:除了1和它本身外，不能被其它任何自然数整除的数----只能被1和它本身整除
        * 训练目标: 通过boolean的flag打标记(3步)
*/
public class HomeWork072 {
    public static void main(String[] args) {
        for (int num=2;num<=1000;num++){
            boolean flag=true;
            for (int i=2;i<=i/2;i++){
                if (num%i==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.print(num+"\t");
            }
        }

    }
}
