package day06;

public class Max {
    public static int getMaxOfArray(int arr[]){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];

            }
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[]={123,5161,4641,4646,464161,491461};
        int max = getMaxOfArray(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                arr[i]=max;

            }
        }
        System.out.println("最大值；"+max);



    }
}
