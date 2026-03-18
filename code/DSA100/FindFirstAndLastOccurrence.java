package DSA100;

import java.util.Scanner;

public class FindFirstAndLastOccurrence {

    public static int[] getOccurrence(int[] arr, int target){
        int[] newArr = new int[2];

        newArr[0] = getFirstOccurrence(arr, target);
        newArr[1] = getLastOccurrence(arr, target);

        return newArr;
    }

    public static int getFirstOccurrence(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }

    public static int getLastOccurrence(int[] arr, int target){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==target) return i;
        }
        return -1;
    }

    public static void display(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5,7,7,8,8,10};

        System.out.print("Enter the target value you want to search: ");
        int target = sc.nextInt();

        int[] newArr = getOccurrence(arr, target);
        display(newArr);
    }

}
