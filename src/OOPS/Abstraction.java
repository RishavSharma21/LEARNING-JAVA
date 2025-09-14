package OOPS;

public class Abstraction {
}

abstract class Vehicle{
    int no_of_tyres ;   //field
    abstract void start();   ///abstract method
}
class Car extends Vehicle{

      Car(){
        no_of_tyres = 4;
    }
    @Override
    void start() {
        System.out.println("Starts with Key");
    }
}

class Scooter extends Vehicle{

    Scooter(){
        no_of_tyres = 2;
    }
    @Override
    void start() {
        System.out.println("Starts with Kick");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        System.out.println(c.no_of_tyres);
        Scooter s = new Scooter();
        s.start();
        System.out.println(s.no_of_tyres);

    }
}

