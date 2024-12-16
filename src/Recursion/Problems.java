package Recursion;

import java.util.Scanner;

//Syntax for recursive function

public class Problems {


//WAP to print numbers from 1 to n using recursion
    static void printIncreasing(int n){
        //base case
        if(n == 1){
            System.out.println(n);
            return;
        }

        //recursive work
        printIncreasing(n-1); //1,2.....,n-1

        //self work
        System.out.println(n);

    }

//WAP to print all natural numbers from n to 1 using recursion
    static void printDecreasing(int n){
        //base case
        if(n == 1){
            System.out.println(1);
            return;
        }

        //self work
        System.out.println(n);

        //recursive work
        printDecreasing(n-1); //n-1,n-2,n-3......n-7....so on

    }


    //WAP to print factorial of a number using recursion
    static int factorial(int n){  // n = 5
        //base case
        if (n == 0) return 1;

        //smaller work - recursive work
        int smallAns = factorial(n-1); //factorial(4) = 24;

        //self work
        int ans = smallAns * n; // factorial(4) * 5 = 120 // n * factorial(n-1);
        return ans;
    }

    //method 2 but same like 1 in a shot form
    static int factorial1(int n){
        if (n == 0) return 1;
        return n * factorial1(n-1);
    }

    //WAP to print fibonacci series up to n
    static int fibonacci(int n){
        if(n == 0 || n == 1) return n;

        //subProblem - recursive work
        int prev = fibonacci(n-1);
        int prevPrev = fibonacci(n-2);

        //selfWork
        return prev+prevPrev;
    }

    //Method 2 of fibonacci (short method)
    static int fibonacci2(int n){

        if(n == 0 || n == 1) return n;

        return fibonacci2(n-1) + fibonacci2(n-2);
    }

    static int sumOfDigits(int n){
        //base case
        if(n >= 0 && n < 10) return n;

        //recursive work -> small ans
        return sumOfDigits(n/10) + n%10;   // n/10 -> for extracting all digits except last
                                               // n%10 -> for extracting last digit
    }

    static int countOfDigits(int n){
        //base case
        if( n >= 0 && n < 10) return 1;

        //recursive work ->small ans
        int ans = countOfDigits(n/10);

        //Self work
        return ans + 1;
    }

    //Method 2 for countOfDigits
    static int countOfDigits2(int n){
        if( n >= 0 && n < 10) return 1;

        return countOfDigits2(n/10) + 1;
    }

    //WAP to print the p power q p^q
    static int power(int p,int q){
        if(q == 0) return 1;

        return power(p,q-1) * p;
    }

    //Method 2 for printing the p power q p^q
    static int power2(int p,int q){
        if(q == 0) return 1;
        int smallPower = power2(p,q/2);
        if(q % 2 == 0){     //for even
            return smallPower * smallPower;
        }
        return p * smallPower * smallPower;  //for odd
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        printIncreasing(n);
//        printDecreasing(n);
//        System.out.println(factorial(n));
//        System.out.println(factorial1(n));
//        for (int i = 0; i <= n; i++) {
//            System.out.print(fibonacci2(i)+" ");
//        }
      //  System.out.println(fibonacci2(7));
//        System.out.println(sumOfDigits(n));
//        System.out.println(countOfDigits(n));
//        System.out.println(countOfDigits2(n));

//      System.out.println(power(5,4));
        System.out.println(power2(5,3));
    }
}


