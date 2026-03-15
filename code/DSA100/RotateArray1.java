package DSA100;

public class RotateArray1 {

    public static int[] rotatedArrayLeft(int[] arr, int rTimes){
        for(int i=0; i<rTimes; i++){
            int first = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        return arr;
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
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d=2;
        int[] newArr1 = rotatedArrayLeft(arr, d);
        System.out.println("Rotate Array to Left: ");
       display(newArr1);
    }
}
