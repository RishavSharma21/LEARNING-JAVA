package MultidimensionalArray;

import java.util.Scanner;

public class AssignmentProblems {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Q1. Write a function which accepts a 2D array of integers and its size as arguments and displays the
    //elements of middle row and the elements of middle column.

    static void printMiddleTermsOfMatrix(int[][] matrix,int r, int c){
        int size = matrix.length; // Size of the matrix (assuming it's square)
        int middle = size / 2; // Middle index

        // Print the cross format
        for (int i = 0; i < size; i++) {
            if (i == middle) {
                // Print the middle row for the middle element
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[middle][j] + " ");
                }
                System.out.println();
            } else {
                // Print spaces before the middle column element
                for (int j = 0; j < middle; j++) {
                    System.out.print("  ");
                }
                // Print the middle column element
                System.out.println(matrix[i][middle]);
            }
        }
    }
//    Q8. Write a program to print the elements of both the diagonals in a square matrix.

    static void printDiagonals(int[][] matrix){

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
//        printMiddleTermsOfMatrix(matrix,r,c);
        printDiagonals(matrix);
    }
}
