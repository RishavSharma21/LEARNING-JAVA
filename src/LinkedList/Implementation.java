package LinkedList;

public class Implementation {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

     // Head, Tail and Size of the list
    Node head = null;
    Node tail = null;
    int size = 0; // keep track of number of elements

    // Insert at end
    void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (head == null) { // empty list
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++; // size badhao
    }

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node temp = new Node(data);
        if (head == null) { // empty list
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++; // size badhao
    }

    // Insert at given index
    void insertAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (idx == 0) {
            insertAtBeginning(data);
            return;
        }
        if (idx == size) {
            insertAtEnd(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++; // size badhao
    }
    // Get element at index
    int getAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index!");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Size of linked list
    int size() {
        return size; // ab direct O(1)
    }

    // Iterative display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Recursive display
    void displayRec(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRec(head.next);
    }

    // Delete node at index
    void deleteAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index!");
            return;
        }
        if (idx == 0) {
            head = head.next;
            if (head == null) tail = null; // agar empty ho gaya
        } else {
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            if (temp.next == null) { // agar last node delete hua
                tail = temp;
            }
        }
        size--; // size kam karo
    }

    // Main method
    public static void main(String[] args) {
        Implementation ll = new Implementation();

        // Insert operations
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);

        System.out.println("Initial list:");
        ll.display(); // 4 5 6
        System.out.println("Size: " + ll.size());

        System.out.println("Insert at beginning:");
        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.display(); // 20 10 4 5 6
        System.out.println("Size: " + ll.size());

        System.out.println("Insert at index 2:");
        ll.insertAt(2, 100);
        ll.display(); // 20 10 100 4 5 6
        System.out.println("Size: " + ll.size());

        System.out.println("Element at index 3: " + ll.getAt(3)); // 4

        System.out.println("Delete at index 2:");
        ll.deleteAt(2);
        ll.display(); // 20 10 4 5 6
        System.out.println("Size: " + ll.size());

        System.out.println("Recursive display:");
        ll.displayRec(ll.head); // 20 10 4 5 6


    }
}
