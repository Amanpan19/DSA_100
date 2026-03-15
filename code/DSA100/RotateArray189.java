package DSA100;

import java.util.Arrays;

public class RotateArray189 {

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static int[] rotate(int[] arr, int k){

        int l = arr.length;
        reverse(arr, 0, l-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, l-1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
}
