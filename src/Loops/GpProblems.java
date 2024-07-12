package Loops;
import java.util.*;

public class GpProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        // 1 2 4 8 16 32 64.............

        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            a *= 2;
        }
    }
}

