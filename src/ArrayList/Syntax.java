package ArrayList;
import  java.util.ArrayList;
public class Syntax {
    public static void main(String[] args) {
        //Wrapper class
//        Integer i = Integer.valueOf(10); //this is a class object in which we are wrapping the primitive data type.
        //as some object classes, methods don't use primitive data types so we wrap them in a class and use.
        //1)As java is  object .oriented language ,so by using these wrapper classes , we are writing object .oriented code.
//        System.out.println(i);
//        Float f = Float.valueOf(10.1f);
//        System.out.println(f);

        //Creating array list
        ArrayList<Integer> l1 = new ArrayList<>();   //They don't take primitive data type eg - int

        //add new element
        l1.add(1);  // 1
        l1.add(2);  // 1 2
        l1.add(3);  // 1 2 3
        l1.add(4);  // 1 2 3 4

        //get an element at index i
        // System.out.println(l1.get(1)); //2

        //print with for loop
//        for (int j = 0; j < l1.size(); j++) {      //l1.size() is a method
//            System.out.println(l1.get(j));   //1 2 3 4
//        }

        //print the array list directly
        System.out.println(l1); //[1,2,3,4]

        //adding element at some index of i eg -> [1, 2, 200, 3, 4]
        l1.add(2, 200);
        System.out.println(l1);

        //Modifying element at index i
        l1.set(2, 20);
        System.out.println(l1); // [1, 2, 20, 3, 4]

        //removing an element at index i
        l1.remove(2);
        System.out.println(l1); //[1, 2, 3, 4]

        //removing an element e  //we don't know about his index .but we want to remove element
        l1.remove(Integer.valueOf(2));
        System.out.println(l1); //[1, 3, 4]

        //checking if an element exist
        boolean ans = l1.contains(Integer.valueOf(100));
        System.out.println(ans);

        //If you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("p");
        l.add(20);
        l.add(false);
        System.out.println(l);
    }
}
