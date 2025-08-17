package OOPS;
public class OopsSyntax {

    public void eat(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println("1");
        OopsSyntax maxy = new OopsSyntax();
        maxy.eat();
        Animals johny = new Animals();
        johny.fly();
    }
}

class Animals{
    void fly(){
        System.out.println("world");
    }
}
