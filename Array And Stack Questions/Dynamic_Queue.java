/**
 * Dynamic_Queue
 */
public class Dynamic_Queue extends Queue_Example
{
    @Override
    public void enqueue(int n)throws Exception {
            if(isFull())
                {
                    int newarr[]= new int[2*arr.length];
                    for(int i=0;i<size;i++)
                        {
                            //edited
                            int idx = (front +i)%arr.length;
                            newarr[i]=arr[idx];                       
                         }
                            front=0;
                            arr=newarr;
                }
                super.enqueue(n);
        }
    public static void main(String []args)throws Exception
        {
            Dynamic_Queue obj1 = new Dynamic_Queue();
            obj1.enqueue(10);
            obj1.enqueue(10);
            obj1.enqueue(10);
            obj1.enqueue(10);
            obj1.enqueue(10);
            obj1.Display();
            System.out.println(obj1.isFull());

            obj1.enqueue(10);
            obj1.enqueue(10);
            obj1.enqueue(10);
            obj1.Display();
            System.out.println(obj1.isFull());
        }
    
}
