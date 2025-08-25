package OOPS;

public class Inheritance {

    //Single level inheritance -----------------------------------
    void eat(){
        System.out.println("I am eating!");
    }
}

 class Dog extends Inheritance{
     public static void main(String[] args) {
         Dog d = new Dog();
         d.eat();
     }
}

//Dog IS-A Animal(Inheritance) -> it is  IS-A Relationship
//Sparrow IS-A Bird




