package Recursion;

import com.sun.jdi.InconsistentDebugInfoException;

import java.util.Scanner;

public class RecursionInStrings {

    static  String removeA(String s,int idx){
         //Base case
        if(idx == s.length()) {
            return "";
        }

        //recursive work
        String smallAns = removeA(s,idx+1);

        //self work
        char currentChar = s.charAt(idx);
        if (currentChar != 'a'){
            return currentChar + smallAns;
        } else {
            return smallAns;
        }
    }

    static String removeA2(String s){
        //base case
        if (s.length() == 0) return "";
//      if(s.isEmpty()) return " ";


        //recursive work
        String smallAns = removeA2(s.substring(1));

        //self work

        char currentChar = s.charAt(0);
        if(currentChar != 'a'){
            return currentChar + smallAns;
        } else {
            return smallAns;
        }
    }

    static String reverseString(String s , int idx){
        //base case
        if(idx == s.length()) return "";

        //recursive work
        String smallAns = reverseString(s,idx+1);

        return smallAns + s.charAt(idx);

    }

    //write program to check wether string is palindrome or not

    static boolean checkPalindrome(String s, int l,int r){
        //base case
        if(l >= r) return true;

        return (s.charAt(l) == s.charAt(r) && checkPalindrome(s,l+1,r-1));
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(removeA(s,0));
//        System.out.println(removeA2(s));
//        System.out.println(reverseString(s,0));
//        String rev = reverseString(s,0);
//        if (rev.equals(s)){
//            System.out.printf("%s is Palindrome",s);
//        } else {
//            System.out.printf("%s is Not Palindrome",s);
//        }

        System.out.println(checkPalindrome(s,0,s.length()-1));





    }
}

