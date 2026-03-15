package DSA100;

import java.util.HashMap;

public class FirstNonRepeatingElement {

    public static int findFirstNonRepetitiveElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,1,0,3};
        int num = findFirstNonRepetitiveElement(arr);
        System.out.println("The first repetitive element is : "+num);
    }
}
