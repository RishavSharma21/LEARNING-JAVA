package OOPS;

public class MethodOverloading {

    //same method name
    //same class
    //different arguments (no of args, type of args, seq of args)
    void showA(int a){
        System.out.println(456);
    }
    void showA(String b){
        System.out.println(45);
    }

    void showA(int...a){
        System.out.println("varargs method");
    }
    public static void main(String[] args) {
        MethodOverloading t = new MethodOverloading();
        t.showA(123);
        t.showA(10,20,30);

    }
}
