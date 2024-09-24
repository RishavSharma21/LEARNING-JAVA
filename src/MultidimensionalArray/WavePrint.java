package MultidimensionalArray;

import java.util.Scanner;

public class WavePrint {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void findmax(int[][] matrix){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(matrix[i][j],max);
            }
        }
        System.out.println("Maximum is:"+max);
    }

    static void wavePrint(int[][] matrix , int r , int c){
        for (int i = 0; i < r; i++) {
            if(i%2 == 0){
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
            } else {
                for (int j = matrix.length-1; j >= 0; j--) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
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
//        findmax(matrix);
        wavePrint(matrix,r,c);

    }
}
