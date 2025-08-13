package Strings;

import java.util.Scanner;

public class Plus_operator {
    public static void main(String[] args) {
        String s = "ABC";
        String x = "GFG";
        s = s + x + "IJK";
//        System.out.println(s);
//        System.out.println("ABC"+10+20);
//        System.out.println(10+20+"ABC");

        int n = 123;
        String p  = n + "";
//        System.out.println(p.length());

        //input a string and update all th even positions to char a , assume 0-based indexing
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        String str = "";
        for (int i = 0; i < b.length(); i++) {
            if(i % 2 == 0){
                str += 'a';
            }else {
                str += b.charAt(i);
            }
        }
        System.out.println(str);
    }
}
