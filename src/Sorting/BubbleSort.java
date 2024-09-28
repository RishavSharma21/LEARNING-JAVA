package Sorting;

import java.util.Scanner;

public class BubbleSort {
    static void printArray(int[] arr) {             //Function for printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr){
//        for (int i = 0; i < arr.length-1; i++) {   //total passes will always be less than arr.length-1
//            for (int j = 0; j < arr.length-1-i; j++) {   //arr.length-1-i this is for preventing unwanted traversing of loop
//                if(arr[j] > arr[j+1]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//                }
//            }
//        }
//        printArray(arr);
//    }

        //Optimised bubble sort
        for (int i = 0; i < arr.length-1; i++) {   //total passes will always be less than arr.length-1
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {   //arr.length-1-i this is for preventing unwanted traversing of loop
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) break;
        }
        printArray(arr);
    }

    static void sortInDecreasingOrder(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = arr.length-1; j > 0 ; j--) {
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    static void checkSortedArray(int[] arr){
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Sorted");
        else System.out.println("Unsorted");
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
//        checkSortedArray(arr);
        System.out.println("Sorted Array");
//        bubbleSort(arr);
        sortInDecreasingOrder(arr);
        printArray(arr);

    }
}
