package DSA100;

import java.util.Scanner;

public class PascalsTriangleArray {

    public static int[][] createPascalTriangle(int rows){
        int[][] triangle = new int[rows][];
        for(int i=0; i<triangle.length; i++){
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for(int j=1; j<i; j++){
                triangle[i][j] = triangle[i-1][j-1]+triangle[i-1][j];
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of rows you want: ");
        int num = sc.nextInt();
        int[][] triangle = createPascalTriangle(num);
        for (int i=0; i<triangle.length; i++){
            for(int j=0; j<=i; j++) System.out.println(triangle[i][j]);
        }

    }
}
