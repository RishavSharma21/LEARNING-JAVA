package Arrays;

import java.util.Scanner;

public class PrefixSum {

    static void printArray(int[] arr) {             //Function for printing the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    //Problem 1 -> Given an integer arr 'a' returns the prefix sum/running sum .
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    //Problem 1(Method 2) -> Given an integer arr 'a' returns the prefix sum/running sum in the same array without creating a new array.

    static void makePrefixSum2(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i -1];  //arr[i] += arr[i-1]
        }
    }

    //Problem 2 -> Given an array of integers of size n. Answer q queries where you need to print the sum
    //of values in a given range of indices from 1 to r (both included).
    //Note: The values of 1 and r in queries follow 1-based indexing.


//   Problem -3 -> Check if we can partition the array into two subarrays with equal sum. More
//    formally, check that the prefix sum of a part of the array is equal to the suffix
//    sum of rest of the array.

    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum){
                return true;
            }
        }
        return false;
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

//        System.out.println("Input Array");
//        printArray(arr);

//        int[] ans = makePrefixSumArray(arr);
//        printArray(ans);
//        makePrefixSum2(arr);
//        System.out.println("Prefix sum");
//        printArray(arr);

        System.out.println("Equal Partition Possible:"+equalSumPartition(arr));




    }
}
