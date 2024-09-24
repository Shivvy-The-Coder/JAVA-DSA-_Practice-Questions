package Linked_List;
public class Linked_list_Implementation {

    public static void main(String[] args) throws Exception{
        Linked_list ll = new Linked_list();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);       
        ll.display();
        ll.addLast(90);
        ll.addFirst(80);
        ll.display();;
        ll.addIndex(2, 60);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.getFirst());
        System.out.println(ll.getlast());
        System.out.println(ll.getIndex(2));

        System.err.println(ll.removeLast());
        ll.display();
        System.err.println(ll.removeFirst());
        ll.display();

        System.out.println(ll.removeindex(2));
        ll.display();
        
    }
}