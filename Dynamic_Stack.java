import java.util.*;

/**
 * Dynamic_Stack
 */
public class Dynamic_Stack extends Stack_Example {

    @Override
    public void push(int item)throws Exception  
        {
            if(isFull())
                {
                    int newarr[] = new int[2*arr.length];
                    for(int i=0;i<arr.length;i++)
                        {
                            newarr[i]=arr[i];
                        }
                    arr=newarr;
                    
                }
                super.push(item);
        }
    public static void main(String []args)throws Exception
        {
            Dynamic_Stack ds = new Dynamic_Stack();
            ds.push(10);
            ds.push(20);
            ds.push(30);
            ds.push(40);
            ds.push(50);
            ds.Display();
            System.out.println(ds.isFull());
            ds.push(60);
            ds.push(70);
            ds.Display();
            System.out.println(ds.isFull());


        }
    }