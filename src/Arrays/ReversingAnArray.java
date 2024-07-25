package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray {

    static void printArray(int[] arr) {             //Function for printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swappingArray(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] reversingArray(int[] arr){         //Method 1  'using different array'
//
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
             ans[j++] = arr[i];       //ans[j++] filling the values in 'ans' array
        }
        return ans;
    }

    static void reversingArray2(int[] arr){    //Method 2 'IN PLACE REVERSE'  "With for loop"
        for (int i = 0 , j = arr.length-1; i < j ; i++ , j--) {      //i < j ensures the middle elements in odd array do not swap with himself.
                                                                     // i <=j it would have performed one extra (unnecessary) swap of the middle element
               swappingArray(arr,i,j);
            }
        }
    static void reverseArray3(int[] arr){    //Same like method 2 "While loop"
        int i = 0,j = arr.length-1;
        while (i < j){
           swappingArray(arr,i,j);
            i++;
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
        int[] ans = reversingArray(arr);
//        printArray(ans);
//        reversingArray2(arr);
        System.out.println(Arrays.toString(arr));
        reverseArray3(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
