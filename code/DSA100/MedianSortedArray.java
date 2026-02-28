package DSA100;

import java.util.Arrays;

public class MedianSortedArray {

    public static double medianVal(int[] arr1, int[]arr2){

        int[] newArr = new int[arr1.length+arr2.length];
        int i=0;
        for(int num:arr1){
            newArr[i]=num;
            i++;
        }
        int j=i;
        for(int num:arr2){
            newArr[j]=num;
            j++;
        }
        Arrays.sort(newArr);

        int numLen = newArr.length;

        if(numLen%2==1){
            return newArr[numLen/2];
        }else{
            return (newArr[numLen/2]+newArr[(numLen/2)-1])/2.0;
        }
    }

    public static void main(String[] args){
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        double val = medianVal(arr1, arr2);
        System.out.println(val);
    }
}
