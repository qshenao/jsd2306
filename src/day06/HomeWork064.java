package day06;

public class HomeWork064 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArrayData(array);
    }

    public static void printArrayData(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组下标 " + i + ": " + array[i]);
        }
    }
}
