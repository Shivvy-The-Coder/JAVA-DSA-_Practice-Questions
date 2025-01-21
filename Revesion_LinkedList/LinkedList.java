package Revesion_LinkedList;
class LinkedList
{
   public class Node 
    {
        int val;
        Node next;
    }

    private Node Head;
    private Node Tail;
    int size;


    public void addFirst(int num)
        {
            Node nn = new Node();
            nn.val=num;

            if(size==0)
                {
                    Head=nn;
                    Tail=nn;
                    size++;
                }
            else
                {
                    nn.next=Head;
                    Head=nn;
                }

        }
    
        public void Display(Node nn)
            {
                if(size==0)
                   { System.out.println("Linked LIsr is Empty");
                return;}
                Node Temp=Head;

                
                while(Temp!=null)
                    {
                        System.out.print(Temp.val);
                        Temp=Temp.next;
                    }
            }

}