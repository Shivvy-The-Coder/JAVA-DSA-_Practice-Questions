package Stack_Codes;

/**
 * Stack
 */
public class Stack 
{
    private int value=0;
    protected int arr[];

    // default sizze of Stack is set to 5
    Stack()
    {
        arr=new int[5];
    }
    // defining size of Stack via user
    public void Stack(int val)
        {
            arr= new int[val];
        }
    
    // isempty function in STack
    public boolean isempty()
    {
        return value==0;
    }
    // isFull will check wether the STack is full or not
    public boolean isFull()
    {
        return value==arr.length;
    }

    // push method
    public void push(int item)throws Exception
    {
        if(isFull())
            {
                throw new Exception("Stack is FULL");
            }
        arr[value]=item;
        value++;
    }
// peek function
    public int peek()throws Exception
    {
        if(isempty())
        {
            throw new Exception("STACK EMPTY");
        }

        return arr[value-1];
    }
// Size functions
    public int size()
    {
        return value;
    }
// POP Fucntions
    public int pop()throws Exception
    {
        if(isempty())
        {
            throw new Exception("STACK UNDERFLOW"); 
        }
        value-=1;
        return arr[value];
    }
// Display function
    public void Display()
    {
        for (int i=0;i<value;i++)
            System.out.print(arr[i]+" ");
    }

}
class Main_S
{
    public static void main(String[] args) throws Exception
    {
        Stack obj = new Stack();
        System.out.println(obj.isempty());
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        obj.Display();
        obj.peek();
        System.out.println(obj.isFull());
        obj.pop();
        obj.pop();
        System.out.println(obj.size());
        obj.Display();

    }
}