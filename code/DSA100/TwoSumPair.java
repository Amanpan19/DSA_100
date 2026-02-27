package DSA100;

import java.util.ArrayList;
import java.util.List;

public class TwoSumPair {

    public static List<List<Integer>> twoSum(int[] numArr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] + numArr[j] == target) {
                    list.add(List.of(numArr[i], numArr[j]));
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        CommonIMpl obj = new CommonIMpl();
        int[] arr = obj.takeInput();
        List<List<Integer>> result = twoSum(arr, 6);
        obj.display(result);
    }

}
