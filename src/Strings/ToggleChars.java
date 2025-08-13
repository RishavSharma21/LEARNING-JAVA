package Strings;

import java.util.Scanner;

public class ToggleChars {

    static void reverseString(StringBuilder sb){
        int n = sb.length();
        int i = 0;
        int j = n-1;

        while( i < j) {
           char left = sb.charAt(i);
           char right = sb.charAt(j);

           sb.setCharAt(i,right);
           sb.setCharAt(j,left);
           i++;
           j--;
        }
    }

    static void frequencyArr(StringBuilder sb){
        int[] freq = new int[26];
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int idx = (int)ch - 97;   //-'a'   //all lower case
            freq[idx]++;
        }
        int maxFreq = -1;
        for (int i = 0; i < freq.length; i++) {
           if(freq[i] > maxFreq){
               maxFreq = freq[i];
           }
        }
        System.out.println(maxFreq);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
//        for (int i = 0; i < n; i++) {
//            char ch = sb.charAt(i);
//            int ascii = (int)ch;
//            if(ascii >= 65 && ascii <= 90){      //capital
//                ascii += 32;
//                ch = (char)ascii;
//                sb.setCharAt(i,ch);
//            }
//           else if(ascii >= 97 && ascii <= 122){    //small
//                ascii -= 32;
//                ch = (char)ascii;
//                sb.setCharAt(i,ch);
//            }
//        }
//        reverseString(sb);

//        System.out.println(sb.reverse());
//        System.out.println(sb);
        frequencyArr(sb);


    }
}
