package Loops;

public class InfiniteLoop {
    public static void main(String[] args) {

//        int i = 1;
//        while (i>=0){
//            System.out.println(i);
//            i = i+1;
//        }

            int x = 4, y = 0;
            while (x >= 0) {
                x--;
                y++;
                if (x == y)
                    continue;
                else
                    System.out.println(x + " " + y);
            }
        }

    }

