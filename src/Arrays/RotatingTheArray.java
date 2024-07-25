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
    
    static void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversingArray(int[] arr, int i ,int j){
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    //Rotate the given array 'a' by k steps ,where k is non-negative. Note- K can be greater tha n as well.
    static int[] rotate(int[] arr ,int k){
        int n = arr.length;
        k = k % n;  //This approach ensures that the array is rotated efficiently without performing unnecessary operations.
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

    //Rotate the given array 'a' by k steps without extra space(another array) ,where k is non-negative. Note- K can be greater tha n as well.

    static void rotatingInPlace(int[] arr,int k) {
        int n = arr.length;
        k = k % n;
        reversingArray(arr,0,n-k-1);
        reversingArray(arr,n-k,n-1);
        reversingArray(arr,0,n-1);
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

//         int[] ans = rotate(arr,k);
        rotatingInPlace(arr,k);
        System.out.println("Array after rotating");
//        System.out.println(Arrays.toString(ans));
        printArray(arr);


    }
}


