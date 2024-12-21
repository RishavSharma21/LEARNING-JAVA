package Recursion;

import java.util.Scanner;

public class Problems2 {

    //given a number and a value k ,print k multiples of num
    static void kMultiples(int n,int k){
        //base case
        if(k == 1) {
            System.out.println(n);
            return ;
        }

        //OR

//        if (k == 0){
//            return;
//        }

        //recursive work
        kMultiples(n,k-1);

        //self work
        System.out.println(n * k);
    }

    //print a sum of series upTo number n
    static int seriesSum(int n){
        if(n == 0) return 0;

        return seriesSum(n-1) + n ;
    }

    //Given a number n , find the sum of all natural numbers till n but with alternate signs

    static int seriesSum2(int n){
        if( n == 0) return 0;

        if(n % 2 == 0){
            return seriesSum2(n-1) -n; //for Even we take -ve , because as input is [1-2+3-4] we can see -ve sign on even values
        } else {
            return seriesSum2(n-1) + n;  // for odd
        }
    }

    //Brute force approach for finding gcd
    static void gcd(int x ,int y){
        int ans = 1;
        int from = Math.min(x,y);

        for (int i = from; i > 0 ; i--) {
            if(x%i == 0 && y%i== 0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    static int iGCD(int x , int y){
        while (x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcd2(int x , int y){
        if(y == 0) return x;

        return gcd2(y,x%y);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
//        kMultiples(x,y);
//        System.out.println(seriesSum(x));
//        System.out.println(seriesSum2(x));
//        gcd(x,y);
//        System.out.println(iGCD(x,y));
//        System.out.println(gcd2(x,y));
    }
}





