package Arrays;

import java.util.Scanner;

public class SuffixSum {
    static void printArray(int[] arr) {             //Function for printing the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void SuffixSum(int[] arr){
        int n = arr.length;
        for (int i = n-2; i >= 0; i--) {
            arr[i] = arr[i]+ arr[i+1];
        }
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

        SuffixSum(arr);
        printArray(arr);

    }
}
