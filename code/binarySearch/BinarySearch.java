package binarySearch;

public class BinarySearch {

    public int findElement(int[] arr, int searchElement){
        int left =0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==searchElement){
                return mid;
            }
            if(arr[left]<=arr[mid]){
                if(arr[left]<=searchElement && searchElement<arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else {
                if(arr[mid]<searchElement && searchElement<=arr[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] arr = {4,5,6,7,0,1,2,3};
        BinarySearch bs = new BinarySearch();
        int res = bs.findElement(arr, 6);

        System.out.println("Element found at the index of: "+res);

    }

}
