package MultidimensionalArray;

import java.util.Scanner;

public class PascalTriangle {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Return n number of pascals triangle
    static int[][] pascalTriangle(int n){
        //row will be equal to n
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            //ith row has i+1 element
            ans[i] = new int[i+1];   //No of rows in ith column is i+1,this will help in making dynamic columns

            //in every row first and last element equal to one
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {        // j = 1 & j < i because first & last element is already 1
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int[][] ans = pascalTriangle(n);
        printMatrix(ans);
    }
}
