package Arrays;

public class Swapping {

    static void swapping(int a,int b){

        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }

    static void swapping2(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
//    swapping(a,b);
//    swapping2(a,b);


    }
}
