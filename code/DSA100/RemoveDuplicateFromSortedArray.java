package DSA100;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromSortedArray {

    public static int[] removeDuplicate(int[] arr){
        if(arr.length==0) return new int[0];

        Map<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, 1);
        }

        int[] newArr = new int[map.size()];
        int index = 0;
        for(int key : map.keySet()){
            newArr[index++] = key;
        }

        return newArr;
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
        int[] arr = {1,1,2,3,3,4,6,7,7};
        int[] newArr = removeDuplicate(arr);
        display(newArr);
        System.out.println();
        System.out.println("Size of the new array: "+newArr.length);
    }

}
