package day08;

public class HomeWork0812 {
    public static void main(String[] args) {
        double climbDistance = 5.0; // 白天爬升的距离为5米
        double slipDistance = 3.5; // 晚上滑落的距离为3.5米
        double wellDepth = 56.7; // 井深为56.7米

        int days = 0; // 初始天数为0天
        double currentHeight = 0.0; // 初始高度为0米

        while (currentHeight < wellDepth) {
            currentHeight += climbDistance; // 白天爬升
            if (currentHeight >= wellDepth) {
                break; // 如果爬升后高度超过井深，则跳出循环
            }
            currentHeight -= slipDistance; // 晚上滑落
            days++; // 天数累加
        }

        System.out.println("蜗牛需要 " + (days + 1) + " 天才能从井底爬出来");
    }
}
