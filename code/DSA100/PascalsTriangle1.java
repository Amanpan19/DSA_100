package DSA100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle1 {

    public static List<List<Integer>> getListOfInteger(int rows){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<rows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int noRow = sc.nextInt();
        List<List<Integer>> triangleList = getListOfInteger(noRow);
        System.out.println(triangleList);
    }
}
