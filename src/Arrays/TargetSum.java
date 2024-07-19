package Arrays;

import java.util.Scanner;

public class TargetSum {



    //WAP to find the total number of pairs whose sum is equal to given value of x
    static int pairSum(int[] arr,int target){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {      //first number
            for (int j = i+1; j < arr.length; j++) {   //second number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletsum(int[] arr,int target){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {              //first number
            for (int j = i+1; j < arr.length; j++) {        //second number
                for (int k = j+1; k < arr.length; k++) {    //third number
                    if(arr[i] +arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
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

//        System.out.print("Enter Target Sum:" + " ");
//        int x = sc.nextInt();
//        System.out.println("Total Pairs equal to target:"+pairSum(arr,x));
//        System.out.println("Total Triplet equal to target is:"+tripletsum(arr,x));
    }
}
