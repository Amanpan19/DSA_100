package leetcode153;

public class FindMinInRotatedArray {

    public int findMin(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]>arr[right]){
                left = mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }

    public static void main(String[] args){
        FindMinInRotatedArray findObj = new FindMinInRotatedArray();
        int[] arr = {3,4,5,1,2};
        int result = findObj.findMin(arr);
        System.out.println("The original array was rotated "+result+" times.");
        System.out.println(arr[result]);
    }

}