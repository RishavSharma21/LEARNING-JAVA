package OOPS;

public class MethodOverriding {
    //same name of methods
    //diff class
    //same parameters(seq,no of,type)

    void show(){
        System.out.println("123");
    }
}

class Hello extends MethodOverriding{

    void show(){
        System.out.println("456");
    }

    public static void main(String[] args) {
        MethodOverriding m = new MethodOverriding();
        m.show();
        Hello h = new Hello();
        h.show();
    }
}

//overriding and access modifier
/*
The access modifier for an overriding class should be stronger or equals to the parent class not
less , eg - if child have public then parent should have public or default or protected
        🔑 Order of Strength (from weakest → strongest)
            private (not inherited, so not overridden at all)
            default (package-private) → accessible only within the same package
            protected → accessible in same package + subclasses (even in different packages)
            public → accessible everywhere

            */