package OOPS;

public class InitializeObject {

    //by reference variable--------------------

//    String color;
//    int age;
//    public static void main(String[] args) {
//        InitializeObject buzo = new InitializeObject();
//        buzo.color = "black";
//        buzo.age = 10;
//        System.out.println(buzo.color+" "+buzo.age);
//    }

    //By using method-------------------------------

    String color;
    int age;

    void initObj(String s , int a){
        color = s;
        age = a;
    }
    void display(){
        System.out.println(color+" "+age);
    }

    public static void main(String[] args) {
        InitializeObject buzo = new InitializeObject();
        buzo.initObj("white" , 10);
        buzo.display();
    }
}
