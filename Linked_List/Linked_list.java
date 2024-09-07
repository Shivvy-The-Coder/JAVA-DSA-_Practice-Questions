package Linked_List;
public class Linked_list {
    public class Node
    {
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    // add first function
    public void addFirst(int num)
        {
            Node node = new Node();
            node.val=num;
            if(size==0)
                {
                    head=node;
                    tail=node;
                    size++;     
                }
            else
                {
                    node.next=head;
                    head=node;
                    size++;
                }
        }

    public void display()
    {
        if(size==0)
            System.out.println("Linked List is Empty");
        else
            {
                Node temp=head;
                
                while(temp!=null)
                {
                    System.out.print(temp.val+" -> ");
                    temp=temp.next;
                }
                System.out.print(" NULL");
                System.out.println();
            }
    }

    public void addLast(int num)
        {
            Node node = new Node();
            node.val=num;
            if(size==0)
                {
                    head=node;
                    tail=node;
                    size++;
                }
            else    
                {
                    tail.next=node;
                    tail=tail.next;
                    size++;
                }
        }
    }
