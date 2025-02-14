package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int countOccurrence(int[] arr,int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurrence(int[] arr,int x){
        int lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                lastindex = i;
            }
        }
        return lastindex;
    }

    static int greaterElement(int[] arr,int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }

    static boolean isSorted(int[] arr){
        boolean check = true;
        for (int i = 1 ; i < arr.length ; i++) {
            if(arr[i] < arr[i-1] ){
                check = false;
                break;
            }
        }
      return check;
    }

    static int[] smallestAndlargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr[arr.length-1]};
        return ans;
    }


    //find last index of given target
    static int lastIndex(int[] arr, int target){
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                lastIndex = i;
            }
        }
        return lastIndex;
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

//        int target = sc.nextInt();


//        System.out.print("Enter the element x:"+" ");
//        int x = sc.nextInt();

//        System.out.println("Element X occurs: "+ countOccurrence(arr,x) + " times" );
//        System.out.println("Last Occurrence of X is: "+ lastOccurrence(arr,x));
//        System.out.println("Elements greater than X is: "+ greaterElement(arr,x));
//        System.out.println("Is Sorted: "+isSorted(arr));
//        int[] ans = smallestAndlargestElement(arr);
//        System.out.println("Smalllest: "+ans[0]);
//        System.out.println("Largest: "+ans[1]);
//        System.out.println(lastIndex(arr,target));
    }
}