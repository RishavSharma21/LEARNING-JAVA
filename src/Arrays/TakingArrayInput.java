package Arrays;

import java.util.Scanner;

public class TakingArrayInput {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        System.out.println("Original arr");
        printArray(arr);

        //trying to copy arr to arr_2
        int[] arr_2 = arr;
        System.out.println("Copied arr_2");
        printArray(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Original array after changing arr_2");
        printArray(arr);
        System.out.println("Copied array after changing arr_2");
        printArray(arr_2);


    }
}
