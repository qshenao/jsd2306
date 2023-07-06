package day05;

public class MaxOfArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.println(arr[i]);
        }



    }
}

