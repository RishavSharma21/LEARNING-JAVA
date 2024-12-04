package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Problems {


    //Reverse a list with arraylist
    static  void  reverseList(ArrayList<Integer> list){
        int i = 0 , j = list.size() - 1;

        while (i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    //Write a program to sort an ArrayList of strings in descending order.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(3);
        System.out.println("Original List: "+list);
//        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reversed List: "+list);
        Collections.sort(list);
        System.out.println("Ascending order: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order: "+list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mohan");
        list1.add("Sham");
        list1.add("Rishav");
        list1.add("America");
        System.out.println("Original List: "+list1);
        Collections.sort(list1);
        System.out.println("Sorted: "+list1);
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("Descending order: "+list1);
    }
}

