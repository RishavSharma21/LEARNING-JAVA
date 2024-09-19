package MultidimensionalArray;

import java.util.Scanner;

public class GenerateSpiral {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Given a positive integer n , generate an n x n matrix filled with elements from 1 to n*n in spiral order
    static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0 , bottomRow = n - 1 , rightColumn = n - 1 , leftColumn = 0;
        int current = 1;          //current element

        while (current <= n * n){

            //Top row -> leftcol to rightcol
            for (int j = leftColumn; j <= rightColumn && current <= n * n; j++) {
                matrix[topRow][j] = current++;
            }
            topRow++;

            //RightColumn -> top row to bottom row
            for (int j = topRow; j <= bottomRow && current <= n * n; j++) {
                matrix[j][rightColumn] = current++;
            }
            rightColumn--;


            //Bottom Row -> rightcol to left col
            for (int j = rightColumn; j >= leftColumn && current <= n * n ; j--) {
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;

            //LeftColumn -> botrow to toprow
            for (int j = bottomRow; j >= topRow && current <= n * n ; j--) {
                matrix[j][leftColumn] = current++;
            }
            leftColumn++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int[][] ans = generateSpiralMatrix(n);
        printMatrix(ans);

    }
}
