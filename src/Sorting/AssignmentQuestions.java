package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class AssignmentQuestions {
    static void printArray(int[] arr) {             //Function for printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //    Q1. Sort the array in descending order using Bubble Sort.
    static void bubbleSort(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) break;
        }
        printArray(arr);
}

//    Q2. Check if the given array is almost sorted. (elements are at-most one position away)
    //We have to count how many times the elements are out of order if that is more that one then
    //it is "not almost sorted"
    
    static boolean checkSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                count++;
            }
            if (count > 1) {     //if more than one 'out of order' element , return false;
                return false;
            }
        }
        return true;
    }

//    Q3. Given an array of digits (values are from 0 to 9), the task is to find the minimum
//    possible sum of two numbers formed from digits of the array. Please note that all digits
//    of the given array must be used to form the two numbers.

    static int findMinSum(int[] arr){
    Arrays.sort(arr);     //will sort so that the small number comes first it will automatically make the digit small
    int num1 = 0;
    int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                num1 = num1 * 10 + arr[i];       //(num1 * 10)-> shifts it one place to the left by multiplying by 10,
                                                 // and then adds the current digit to form the new number
            }
            else {
                num2 = num2 * 10 + arr[i];
            }
        }
        return num1 + num2;
    }
//    Q13. Given an integer array and an integer k where k<=size of array, We need to return the kth smallest
//    element of the array.

    static int findKthSmallestElement(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr[k-1];   //(k-1) for 0-based indexing
    }


        public static void main (String[]args){
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

            System.out.println("Enter Kth Element");
            int k = sc.nextInt();

//            bubbleSort(arr);
            

//            System.out.println(checkSort(arr));
//            System.out.println(findMinSum(arr));
//            System.out.println("Kth smallest element is: "+findKthSmallestElement(arr,k));

        }
    }

