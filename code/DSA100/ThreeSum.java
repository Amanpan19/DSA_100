package DSA100;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> foundPairsFor3Sum(int[] numArr, int targetVal){
        if(numArr.length == 0){
            return new ArrayList<>();
        }
        Arrays.sort(numArr);
        Set<List<Integer>> intSet = new HashSet<>();
        for(int i=0; i<numArr.length-2; i++){
            int left = i+1;
            int right = numArr.length-1;
            while(left<right){
                int sum = numArr[i]+numArr[left]+numArr[right];
                if(sum==targetVal){
                    intSet.add(Arrays.asList(numArr[i],numArr[left],numArr[right]));
                    left++;
                    right--;
                } else if (sum<targetVal) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return intSet.stream().toList();
    }
    public static int[] createIntArr(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        if(size<3) System.out.println("Array size can not be less then 3");
        else {
            int[] intArr = new int[size];
            for(int i=0; i<intArr.length; i++){
                System.out.print("Enter the "+(i+1)+" element: ");
                int val = sc.nextInt();
                intArr[i]=val;
            }
            return intArr;
        }
        return new int[]{};
    }
    public static int getTargetValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        return sc.nextInt();
    }
    public static void main(String[] args){
        int[] arrToPass = createIntArr();
        int targetVal = getTargetValue();
        List<List<Integer>> resultList = foundPairsFor3Sum(arrToPass, targetVal);
        System.out.println(resultList);
    }
}
