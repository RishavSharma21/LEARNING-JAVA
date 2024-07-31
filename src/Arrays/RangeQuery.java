package Arrays;

import java.util.Scanner;

public class RangeQuery {
    static void printArray(int[] arr) {             //Function for printing the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    //Problem 2 ->Given an array of integers of size n. Answer q queries where you need to print the sum
    //of values in a given range of indices from 1 to r (both included).
    //Note: The values of 1 and r in queries follow 1-based indexing.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n+1]; //n+1 this is because of 1-based indexing

        System.out.println("Enter " + n + " elements of Array:");
        for (int i = 1; i <= n; i++) {  //1-based Indexing
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Array");
        printArray(arr);

        int[] prefsum = makePrefixSumArray(arr);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter Range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefsum[r] - prefsum[l-1];
            System.out.println("Sum:"+ans);
        }


    }
}
