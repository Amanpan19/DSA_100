package DSA100;

import java.util.Scanner;

public class IsPalindrome {
    public static int checkPalindrome(int num){
        int newDigit = 0;
        while(num!=0){
            newDigit = newDigit*10+num%10;
            num = num/10;
        }
        return newDigit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases u want to run: ");
        int t = sc.nextInt();
        while(t-->0){
            System.out.print("Enter the val: ");
            int num = sc.nextInt();
            int result = checkPalindrome(num);
            if(result== num) System.out.println("The value is palindrome.");
            else System.out.println("The value is not palindrome.");
        }
    }
}
