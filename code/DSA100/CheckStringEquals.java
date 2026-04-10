package DSA100;

import java.util.HashMap;
import java.util.Scanner;

// Checks if we can make string 1 from string 2
//str1: "jewel"
//str2: "weljew"

// can we make str1 from str2?
public class CheckStringEquals {

    // Method 1
    public static boolean isStringEquals(String str1, String str2){
        int[] count = new int[256];
        for(char ch: str2.toCharArray()){
            count[ch]++;
        }

        for(char ch1: str1.toCharArray()){
            if(count[ch1]==0){
                return false;
            }
            count[ch1]--;
        }

        return true;
    }

    // Method 2

    public static boolean isStringEquals2(String str1, String str2){

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: str2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch1: str1.toCharArray()){
            if(map.containsKey(ch1) && map.get(ch1)==0){
                return false;
            }

            map.put(ch1, map.getOrDefault(ch1, 0)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string");
        String str2 = sc.nextLine();

        String val = isStringEquals(str1, str2) ? "Yes, we can make str1 from str2":
                "No, we cannot make str1 from str2";

        System.out.println(val);
    }

}
