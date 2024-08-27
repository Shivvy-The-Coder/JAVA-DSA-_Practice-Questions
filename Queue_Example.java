/**
 * Queue_Example
 */
public class Queue_Example {

    protected int []arr;
    protected int size;
    protected int front;

    public Queue_Example()
    {
        arr = new int[5];
    }
    public Queue_Example(int n)
    {
        arr = new int[n];
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isFull()
    {
        return size ==arr.length;
    }
    public void enqueue( int n)throws Exception
    {
        if(isFull())
            throw new Exception("Queue is FUll");
          
        int idx =(front+size)%arr.length; 
         arr[idx]=n;
        size++; 
    }
    public int Dequeue()throws Exception
    {
        if(isEmpty())
            throw new Exception("Queue Is Empty");
        front=(front+1)%arr.length;
        size--;
        return arr[front];
    }
    public void Display()
    {
        for (int i=0;i<size;i++)
            {
                int idx = (i+front)%arr.length;
                System.out.print(arr[idx]+" ");
            }
            System.out.println();
    }
}
/**
 * using_Queue

 */
class using_Queue 
{
public static void main(String[] args)throws Exception
 {
    Queue_Example obj = new Queue_Example();
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    obj.enqueue(40);
    obj.Dequeue();
    obj.Dequeue();
    obj.Display();
    obj.enqueue(50);
    obj.enqueue(60);
    obj.Display();
}
    
}