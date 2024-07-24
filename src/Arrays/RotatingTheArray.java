package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotatingTheArray {


    static void printArray(int[] arr) {             //Function for printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Rotate the given array 'a' by k steps ,where k is non-negative. Note- K can be greater tha n as well.
    static int[] rotate(int[] arr ,int k){
        int n = arr.length;
        k = k % n;
        int j = 0;
        int[] ans = new int[n];

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
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
        System.out.println("Original Array");
        printArray(arr);
        System.out.println("Enter K");
        int k = sc.nextInt();

         int[] ans = rotate(arr,k);
        System.out.println("Array after rotating");
        System.out.println(Arrays.toString(ans));
        
    }
}


