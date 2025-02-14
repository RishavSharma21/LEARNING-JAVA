package Recursion;

import java.util.Scanner;

public class RecursionInArrays {

    static void printArray(int[] arr,int idx){
        int n = arr.length;
        //base case
        if(idx == n){
            return ;
        }

        //self work
        System.out.println(arr[idx]);

        //recursive work
        printArray(arr,idx+1);
    }

    //Max element in the array

    static int findMaxElement(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int smallAns = findMaxElement(arr,idx+1);

        return Math.max(arr[idx],smallAns);
    }

    //Sum of elements of the array
    static int findSum(int[] arr, int idx){

        //base Case
        if(idx == arr.length - 1){     // if(idx == arr.length) return 0;
            return arr[idx];
        }
        
        //Recursive work -> sub problem
        int smallAns = findSum(arr,idx+1);

        //Self work
        return smallAns + arr[idx];
    }








    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of Array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = arr.length;
//        printArray(arr,0);

//        System.out.println(findMaxElement(arr,0));
        System.out.println(findSum(arr, idx));
    }
}

