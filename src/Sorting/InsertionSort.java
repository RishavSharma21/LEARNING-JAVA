package Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void printArray(int[] arr) {             //Function for printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {    //assume arr[o] is sorted
            for (int j = i; j >= 1 ; j--) {        //will compare elements only from the left side
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;         //to avoid unnecessary swaps
            }
        }
    }

    //we can also write insertion sort code like this , can put 2 conditions in for loop
    static void insertionSort2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--)
                swap(arr, j, j - 1);
        }
    }

    //Same insertion sort code with while loop
    static void insertionSort3(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>=1 && arr[j] < arr[j-1]) swap(arr,j,j-1);
            j--;
        }
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
        System.out.println("Input Array");
        printArray(arr);
        System.out.println("Sorted array");
        insertionSort(arr);
        printArray(arr);
        System.out.println("Sorted array");
        insertionSort2(arr);
        printArray(arr);
        System.out.println("Sorted array");
        insertionSort3(arr);
        printArray(arr);

    }
}
