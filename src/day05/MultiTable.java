package day05;

public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1,num = 9;i<=num;i++){
            System.out.print(i + "x" + num + "=" + (i * num) + "\t");
        }

    }
}

