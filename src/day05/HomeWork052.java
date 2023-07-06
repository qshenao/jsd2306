package day05;
/*1. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出

2. 利用for循环计算：求8的阶乘，并输出

3. 利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：

   ```java
   *
   ***
   *****
   *******
   *********
   ***********
   ```

4. 定义数组，包含10个元素，随机生成数据(范围自拟)，查找最大值和最小值，并输出
*/

import java.util.Random;

public class HomeWork052 {
    public static void main(String[] args) {
        //利用for循环计算：求数字1到100之内，所有偶数的和，并输出
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println();

        //利用for循环计算：求8的阶乘，并输出
        int sum1 = 1;
        for (int i = 1; i <= 8; i++) {
            sum1 *= i;
        }
        System.out.println(sum1);
        System.out.println("----------------------------------------");
        //利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：
        //
        //   ```java
        //   *
        //   ***
        //   *****
        //   *******
        //   *********
        //   ***********
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        int arr[] = new int[10];
        Random ra = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt(10);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最大值："+max+"，最小值："+min);
    }
}
