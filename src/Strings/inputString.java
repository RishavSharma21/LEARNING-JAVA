package Strings;

import java.util.Scanner;

public class inputString {

    static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(isVowel(ch) == true){
                count++;
            }
        }
        System.out.println(count);
    }
}
