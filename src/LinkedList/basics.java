package LinkedList;

public class basics {

    static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayRec(head.next);
    }

    static  void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static class Node{
            int data; //value
            Node next;  //address of the next  node
            Node(int data){
            this.data = data;
           }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(5);
        Node d = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        System.out.println();
        displayRec(a);


    }
}
