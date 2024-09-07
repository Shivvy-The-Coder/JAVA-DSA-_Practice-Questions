package Linked_List;
public class Linked_list_Implementation {

    public static void main(String[] args) {
        Linked_list ll = new Linked_list();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);       
        ll.display();
        ll.addLast(90);
        ll.addFirst(80);
        ll.display();;
    }
}