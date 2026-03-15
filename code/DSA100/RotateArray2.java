package DSA100;

public class RotateArray2 {

    public static int[] rotatedArrayRight(int[] arr, int rTimes){
        for(int i=0; i<rTimes; i++){
            int l = arr.length;
            int last = arr[l-1];
            for(int j=l-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
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
        int[] newArr1 = rotatedArrayRight(arr, d);
        System.out.println("Rotate Array to Right: ");
        display(newArr1);
    }
}
