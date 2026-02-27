package DSA100;

import java.util.List;
import java.util.Scanner;

public class CommonIMpl {

    public <T> void display(List<T> result) {
        for (T item : result) {
            System.out.println(item);
        }
    }

    public int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}
