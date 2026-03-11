package DSA100;

import java.util.Scanner;

public class ValidParentheses {
    public static boolean checkValid(String str) {
        while (true) {
            if (str.contains("[]")) {
                str = str.replace("[]", "");
            } else if (str.contains("()")) {
                str = str.replace("()", "");
            } else if (str.contains("{}")) {
                str = str.replace("{}", "");
            } else {
                return str.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check: ");
        String s = sc.nextLine();
        boolean val = checkValid(s);
        System.out.println(val);
    }
}
