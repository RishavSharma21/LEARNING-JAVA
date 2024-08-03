package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0s_1s_2sArray {

    static void printArray(int[] arr) {             //Function for printing the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void SortArray0s1s2s(int[] arr){
        int noOfZeroes = 0;
        int noOfOnes = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) noOfZeroes++;
            if(arr[i] == 1) noOfOnes++;
        }

        for (int i = 0; i < n; i++) {
            if(i < noOfZeroes){
                arr[i] = 0;
            }
             else if (i < noOfZeroes+noOfOnes) {
                arr[i] = 1;
            }
             else {
                 arr[i] = 2;
            }
        }

//        for (int i = 0; i < n; i++) {           //for less code
//         if(i < noOfZeroes) arr[i] = 0;
//         else if(i < noOfZeroes + noOfOnes) arr[i] = 1;
//         else arr[i] = 2;
//        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SortArray0s1s2s(arr);
        printArray(arr);
    }
}
