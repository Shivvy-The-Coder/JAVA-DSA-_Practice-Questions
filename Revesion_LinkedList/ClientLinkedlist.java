package Revesion_LinkedList;

public class ClientLinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(6);
        ll.Display();
        System.out.println();
        ll.addLast(13);
        ll.Display();
    }
}
