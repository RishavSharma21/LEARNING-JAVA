package MultidimensionalArray;

import java.util.Scanner;

public class RotateMatrixBy90Degree {


    static void transposeInPlace(int[][] matrix , int r , int c){

        for(int i =0 ;i < r;i++){
            for(int j = i+1;j < r;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void reverseColumn(int[][] matrix , int n ){
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n/2; i++) {
                int temp = matrix[i][j];
                matrix[i][j]= matrix[n-i-1][j];
                matrix[n-i-1][j] = temp;
            }
        }
    }
    //rotating a  square matrix
    static void rotateMatrix(int[][] matrix,int n){      //int n because here r = c
        //Transpose
        transposeInPlace(matrix,n,n);
        //Reverse each row of transposed matrix
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }
    
    static void rotateMatrixAntiClockwise(int[][] matrix , int n){
        //Transpose
        transposeInPlace(matrix,n,n);
        //Reverse each column of transposed matrix
        reverseColumn(matrix,n);
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

//        rotateMatrix(matrix,r);
        System.out.println("Rotated Matrix");
//        printMatrix(matrix);
        rotateMatrixAntiClockwise(matrix,r);
        printMatrix(matrix);
    }
}
