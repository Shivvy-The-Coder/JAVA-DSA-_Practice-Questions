package Linked_List;
public class Linked_list {
    public class Node
    {
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    protected int size;

    // addFirst function take time complexity of O(1)
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
    
    // Display function take time complexity of O(n)
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

    // addLast function take tim  e complexity of o(1)
    public void addLast(int num)
        {

            if(size==0)
                {
                    addFirst(num);
                }
            else    
                { 
                    Node node = new Node();
                    node.val=num;
                    tail.next=node;
                    tail=node;
                    size++;
                }
        }
    
    public Node getnode(int k) throws Exception
    {
        if(k<0 || k>=size)
            throw new Exception("Index out of Range");
        
        Node temp=head;
        for (int i=0;i<k;i++)
            temp=temp.next;
        return temp;
    }    

    public void addIndex(int idx, int item)throws Exception
    {
        if(idx==0)
            addFirst(item);
        else if (idx==size)
            addLast(item);
        else
        {
        Node node= new Node();
        node.val=item; 
        Node pre=getnode(idx-1);
        // Node getAdd=pre.next;
        // pre.next=node;
        // node.next=getAdd;
        // The above code has been written by me

        // the below code has been written by monu sir
        node.next=pre.next;
        pre.next=node;
        size++;
        }
        }
    
    public int getFirst()
        {return head.val;}
    public int getlast()
        {return tail.val;}
    public int getIndex(int idx)throws Exception
        {
            return getnode(idx).val;
        }
    
        // ti
    public int removeFirst()
    {
        int val=head.val;
        if(size==1)
            {
                head=null;
                tail=null;
            } 
        else
            {
                Node temp = head;
                head=head.next;
                temp.next=null;
            }
            size--;
        return val;
    }
    
    public int removeLast() throws Exception
    {
        if(size==1)
            {
                removeFirst();
            }
        else
            {
                int val=tail.val;
                Node temp=getnode(size-2);
                temp.next=null;
                tail=temp;
                return val;
            }
        size--;
        return 0;
    }

    public int removeindex(int idx)throws Exception
    {
        if(idx==1)
            removeFirst(); 
        else if (idx==size-1)
            removeLast();
        else
            {
                Node temp= getnode(idx);
                int val=temp.val;
                Node prev = getnode(idx-1);
                prev.next=temp.next;
                temp.next=null;
                return val;
            }
        return 0;    
    }

}
