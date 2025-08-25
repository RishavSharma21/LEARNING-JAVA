package OOPS;

public class A{
    void showA(){
        System.out.println("A class method");
    }
}

class B extends A{

    void showB(){
        System.out.println("B class Method");
    }
//    public static void main(String[] args) {
//        A obj1 = new A();
//        obj1.showA();
//
//        B obj2 = new B();
//        obj2.showA();
//        obj2.showB();
        //IN single level A class object can only call A class method . but B class object can call both A and B class method
//    }
}

//class C extends B{
//    void showC(){
//        System.out.println("C class method");
//    }
//
//    public static void main(String[] args) {
//
//        //Multilevel Inheritance
//
//        A obj1 = new A();
//        obj1.showA();
//        System.out.println("----------------");
//        B obj2 = new B();
//        obj2.showA();
//        obj2.showB();
//        System.out.println("-----------------");
//        C obj3 = new C();
//        obj3.showA();
//        obj3.showB();
//        obj3.showC();
//    }
//}

class C extends A{
    void showC(){
        System.out.println("C class method");
    }

    public static void main(String[] args) {

        //Hierarchical Inheritance

        A obj1 = new A();
        obj1.showA();
        System.out.println("----------------");
        B obj2 = new B();
        obj2.showA();
        obj2.showB();
        System.out.println("-----------------");
        C obj3 = new C();
        obj3.showA();
        obj3.showC();
    }
}