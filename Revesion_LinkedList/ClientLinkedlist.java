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
        System.out.println();
        ll.addIndex(2,20 );
        ll.Display();
        System.out.println("\n"+ll.size);
        ll.addFirst(90);
        System.out.println("\n" + ll.size);
        ll.Display();
        System.out.println();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getIndex(3));

    }
}
