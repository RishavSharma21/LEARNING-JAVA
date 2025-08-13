package Strings;


public class indexof {
    public static void main(String[] args) {
        String s  = "Ranbir Kapoor";
        System.out.println(s.indexOf('b'));
        System.out.println(s.lastIndexOf('o'));

        String a = "abcde";
        String b = "abc";
        System.out.println(a.compareTo(b));

        System.out.println(s.startsWith("Ra"));
        System.out.println(s.contains("la"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(a.concat(b));
        System.out.println(a.substring(2)); //prints c and age bale indices
        System.out.println(a.substring(2,4)); // print from index 2 upto index 3 doesnot  include 4th


        //print all substrings
        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j <= a.length(); j++) {
                System.out.print(a.substring(i,j)+" ");
            }
            System.out.println();
        }
    }

}
