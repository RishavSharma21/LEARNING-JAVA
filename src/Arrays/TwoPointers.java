package Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class TwoPointers {

    static void printArray(int[] arr) {             //Function for printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray3(int[] arr){    //Same like method 2 "While loop"
        int i = 0,j = arr.length-1;
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    //Sort an Array consisting of only 0s and 1s  [APPROACH 1]
    static void SortZeroesAndOnes(int[] arr){
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zeroes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i < zeroes){  // 0 to zeroes -1 : 0;  || zeroes to n-1 : 1;
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    //Sort an Array consisting of only 0s and 1s  [APPROACH 2]

    static void sortingZeroesAndOnes2(int[] arr){
        int n = arr.length;
        int i = 0 , j = n-1;

        while (i < j)
        {
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }

        }
    }

    //Wap to sort the even and odd numbers in the array Relative order od array does not matter
    //Relative array example arr = 1 8 3 2 9 , 'ans' arr = 1 8 2 3 9 can be our answer
    static void sortArrayByParity(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i < j){
            if(arr[i] % 2 == 1 && arr[j] % 2 == 0){
                swap(arr,i,j);
                i++;
                j--;
            }

            if(arr[i] % 2 == 0){
                i++;
            }
            if(arr[j] % 2 == 1){
                j--;
            }
        }
    }

    //Given an array 'a' sorted in non-decreasing order,return an array of the squares of each number sorted in non-decreasing order

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int i = 0, j = n-1;
        int[] ans = new int[n];
        int k = 0;

        while (i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i] * arr[i];
                i++;
            }
            else {
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
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

        System.out.println("Original Array");
        printArray(arr);

//        SortZeroesAndOnes(arr);
        System.out.println("Sorted Array");
//        printArray(arr);
//        sortingZeroesAndOnes2(arr);
//        printArray(arr);
//        sortArrayByParity(arr);
        int[] ans = sortSquares(arr);
        reverseArray3(ans);
        printArray(ans);



    }
}
