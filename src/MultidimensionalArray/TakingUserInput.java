package MultidimensionalArray;

import java.util.Scanner;

public class TakingUserInput {

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int r = sc.nextInt();
        System.out.println("Enter No of Columns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter Total "+r*c+" Elements in the Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);


    }
}
