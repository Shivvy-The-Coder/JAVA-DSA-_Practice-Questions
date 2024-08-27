/**
 * Stack
 */
public class Stack_Example {

    protected int [] arr;
    private int idx;

     Stack_Example()
    {
        arr= new int[5];
    }
    public void Stack_Example(int n)
    {
        arr= new int[n];  
    }
    public boolean isEmpty()
    {
        return idx==0;
    }

    public boolean isFull()
    {
        return idx==arr.length;
    }

    public void push(int item)throws Exception
    {   if(isFull())
            throw  new Exception ("Stack overflow");
        arr[idx]=item; 
        idx++;
    }

    public int size ()
    {
        return idx;
    }

    public void Display()
    {   System.out.println();
        for (int i=0;i<idx;i++)
            System.out.print(arr[i]+" ");
    }

    public int peek()throws Exception
    {   if(isEmpty())
        throw new Exception("Stack Underflow ");
        return arr[idx-1];
    }
    public int pop()throws Exception
    {   if(isEmpty())
            throw new Exception("Stack Underflow ");
        idx-=1; 
        return arr[idx-1];
    }
}

class using_Stack
{
    public static void main(String[] args)throws Exception {
        Stack_Example obj = new Stack_Example();
        obj.isEmpty();
        obj.isFull();
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        obj.isFull();
        obj.Display();
        obj.pop();
        System.out.println("\n"+obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        obj.Display();        
    }
} 