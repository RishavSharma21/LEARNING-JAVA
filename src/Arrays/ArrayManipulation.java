package Arrays;

import java.util.Scanner;

public class ArrayManipulation {


    static int findUnique(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    static int firstRepeatingValue(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        }
        return min;
    }

    static int secondMin(int[] arr){
        int min = findMin(arr);
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int SecondMin = findMin(arr);
        return SecondMin;
    }

    static int lastRepeatingValue(int[] arr){
        int lastValue = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    lastValue = arr[i];
                }
            }
        }
        return lastValue;
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

//        System.out.print("Enter Target Sum:" + " ");
//        int x = sc.nextInt();
//        System.out.println("Unique Number in an Array is:"+findUnique(arr));
//        System.out.println("Max element is: "+findMax(arr));
//        System.out.println("Second max element is:"+findSecondMax(arr));
//        System.out.println("Repeating values in this Array is:"+firstRepeatingValue(arr));
//        System.out.println("Last Repeating value is:"+lastRepeatingValue(arr));
//        System.out.println("Minimum value in a array is:"+findMin(arr));
        System.out.println("Second min value is:"+ secondMin(arr));
    }


    }
