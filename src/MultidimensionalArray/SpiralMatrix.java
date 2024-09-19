package MultidimensionalArray;

import java.util.Scanner;


public class SpiralMatrix {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int[][] matrix , int r , int c){
        int topRow = 0 , bottomRow = r - 1 , rightColumn = c - 1 , leftColumn = 0;
        int totalElements = 0;

        while (totalElements < r * c){

            //Top row
            for (int j = leftColumn; j <= rightColumn && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j]+ " ");
                totalElements++;
            }
            topRow++;

            //RightColumn
            for (int j = topRow; j <= bottomRow && totalElements < r * c; j++) {
                System.out.print(matrix[j][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;

            //Bottom Row
            for (int j = rightColumn; j >= leftColumn && totalElements < r * c ; j--) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //LeftColumn
            for (int j = bottomRow; j >= topRow && totalElements < r * c ; j--) {
                System.out.print(matrix[j][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;
        }
    }



    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter No of Rows and Columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter "+totalElements+" Values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);


        System.out.println("Spiral Matrix");
        spiralMatrix(matrix,r,c);
    }
}
