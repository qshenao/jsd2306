package day08;
/**井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米1、计算蜗牛需要多少天才能从井底爬出来!
 * */
public class HomeWork0813 {
    public static void main(String[] args) {
        double a=5.0;
        double b=3.5;
        int day=0;
        double len=56.7;
        double len1=0.0;

        while (len1 < len) {
            len1 += a; // 白天爬升
            if (len1 >= len) {
                break; // 如果爬升后高度超过井深，则跳出循环
            }
            len1 -= b; // 晚上滑落
            day++; // 天数累加
        }
        System.out.println("蜗牛需要 " + (day + 1) + " 天才能从井底爬出来");


    }
    /**day1 5,3.5 1.5
     * day2 1.5+5 3.5 3
     * day3  3+5  3.5 4.5
     *

    * */
}
