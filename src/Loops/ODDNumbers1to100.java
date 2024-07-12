//WAP to print odd numbers from 1 to 100

package Loops;
import java.util.*;

public class ODDNumbers1to100 {
    public static void main(String[] args) {

       //100 iterations (Method 1)
        for (int i = 1; i <= 100; i++) {
            if(i%2 != 0) System.out.print(i+" ");
        }

       // 50 iterations (Method 2)
        for (int i = 1; i <= 100 ; i+=2) {
            System.out.print(i+" ");
        }

        //100 iterations(continue) (Method 3)
        for (int i = 1; i <= 100; i++) {
            if(i%2 == 0) {
            continue;
            }
            System.out.print(i+" ");
        }

    }
}
