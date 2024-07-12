package Loops;

import java.util.*;
public class BasicProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

// Method 1
        // write Ap 1 3 5 7 9 upto n terms
        // an = a + (n - 1)d  here a = first term , d = common difference
        // this the formula for finding n terms

//        for (int i = 1; i <= 2 * n - 1 ; i+= 2) {
//            System.out.print(i+" ");
//        }

//Method 2
        // AP = 5 1 -3 -7 -11 -15 -19 -23..........
//        int a = 5 , d = -4 ;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a+" ");
//            a += d;
//        }


    }
}