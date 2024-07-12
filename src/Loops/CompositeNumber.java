package Loops;

import java.util.*;
public class CompositeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for (int i = 2; i <= n -1 ; i++) {
            if(n % i == 0){    //'i' is a factor of 'n'
                System.out.println("Composite Number");
                break;
            }
        }



    }
}
