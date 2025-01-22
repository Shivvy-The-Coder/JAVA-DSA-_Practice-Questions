package Revesion_LinkedList;

class LinkedList {
    public class Node {
        int val;
        Node next;
    }

    private Node Head;
    private Node Tail;
    int size;

    public void addFirst(int num) {
        Node nn = new Node();
        nn.val = num;

        if (size == 0) {
            Head = nn;
            Tail = nn;

        } else {
            nn.next = Head;
            Head = nn;
        }
        size++;

    }

    public void addLast(int val) {
        Node nn = new Node();
        nn.val = val;
        if (size == 0) {
            Head = nn;
            Tail = nn;

        } else {
            Tail.next = nn;
            Tail = nn;
        }
        size++;
    }

    public void Display() {
        Display(Head);
    }

    private void Display(Node nn) {
        if (size == 0) {
            System.out.println("Linked LIsr is Empty");
            return;
        }
        Node Temp = Head;

        while (Temp != null) {
            System.out.print(Temp.val + " -> ");
            Temp = Temp.next;
        }
        System.out.print("NULL");

    }

    public Node goToIndex(int index) {
        int x = 0;
        Node temp = Head;
        while (x != index) {
            temp = temp.next;
            x++;
        }
        return temp;
    }

    public void addIndex(int index, int value) {
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node temp = goToIndex(index - 1);

            Node tempnext = goToIndex(index);
            Node nn = new Node();
            nn.val = value;
            temp.next = nn;
            nn.next = tempnext;
        }
        size++;
    }

    public int getFirst() {
        return goToIndex(0).val;
    }

    public int getLast() {
        return goToIndex(size - 1).val;
    }

    public int getIndex(int index) {
        return goToIndex(index).val;
    }
}