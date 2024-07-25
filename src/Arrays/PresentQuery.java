package Arrays;

import java.util.Scanner;

public class PresentQuery {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100008];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    //CHECK if a number is present in array or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(arr);
        System.out.println("Enter Number of Queries:");
        int q = sc.nextInt();

       while(q > 0){
           System.out.println("Enter Number to be Searched:");
           int x = sc.nextInt();
           if(freq[x] > 0){
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
           q--;
       }



    }
}
