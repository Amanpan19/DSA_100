package DSA100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseInteger {

    public static class NumDetails{
        private int sno;
        private int numToReverse;
        private int reversed;

        public NumDetails(int sno, int numToReverse, int reversed){
            this.sno=sno;
            this.numToReverse = numToReverse;
            this.reversed = reversed;
        }

        public NumDetails(){}

        public void setSno(int sno){
            this.sno = sno;
        }
        public int getSno(){
            return this.sno;
        }
        public void setNumToReverse(int numToReverse){
            this.numToReverse = numToReverse;
        }
        public int getNumToReverse(){
            return this.numToReverse;
        }
        public void setReversed(int reversed){
            this.reversed = reversed;
        }
        public int getReversed(){
            return this.reversed;
        }
    }

    public static int reverseNum(int num){
        int val=0;
        while(num!=0){
            val = val*10+(num%10);
            num = num/10;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NumDetails> reverseTable = new ArrayList<>();

        System.out.println("No of Test you wants to run?");
        int num = sc.nextInt();

        int i = 1;

        while (num-- != 0) {
            System.out.println("Enter the number you want to reverse:");
            int rev = sc.nextInt();

            int result = reverseNum(rev);

            reverseTable.add(new NumDetails(i++, rev, result));
        }

        printTheValsWithReverse(reverseTable);
    }

    public static void printTheValsWithReverse(List<NumDetails> reverseTable) {

        System.out.println("+-----+--------------------+--------------------+");
        System.out.println("| SNO | Number To Reverse  | Reversed           |");
        System.out.println("+-----+--------------------+--------------------+");

        for (NumDetails detail : reverseTable) {
            System.out.printf("| %-3d | %-18d | %-18d |%n", detail.getSno(), detail.getNumToReverse(),
                    detail.getReversed());
        }
        System.out.println("+-----+--------------------+--------------------+");
    }
}
