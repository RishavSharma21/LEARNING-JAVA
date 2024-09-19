package MultidimensionalArray;

import java.util.Scanner;

public class TransposeOfMatrix {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Write a program to display transpose of matrix entered by the user

    static int[][] findTranspose(int[][] matrix,int r,int c){       //let r = 2 ,c = 3
        int[][] ans = new int[c][r];              //here c = 2 r = 3

        for (int i = 0; i < c; i++) {                  // c = 3
            for (int j = 0; j < r; j++) {              // r = 2
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    // Below code is valid only for r = c
    static void transposeInPlace(int[][] matrix , int r , int c){

      for(int i =0 ;i < r;i++){
          for(int j = i+1;j < r;j++) {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
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

        System.out.println("Transpose of Matrix");
        int[][] ans = findTranspose(matrix,r,c);
//        transposeInPlace(matrix,r,c);
        printMatrix(ans);
    }
}


