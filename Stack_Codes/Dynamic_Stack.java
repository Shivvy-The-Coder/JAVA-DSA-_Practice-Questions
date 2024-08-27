package Stack_Codes;

/**
 * Dynamic_Stack
 */
public class Dynamic_Stack extends Stack{

        public void push(int item)throws Exception
        {
            if(isFull())
            {
                int newarr[]= new int[2* arr.length];
                for (int i=0;i<arr.length;i++)
                    {
                        newarr[i]=arr[i];
                    }
                arr=newarr;
            }
            super.push(item);
        }
}
class Main_DS
{
    public static void main(String args[])throws Exception
        {
            Dynamic_Stack st= new Dynamic_Stack();
            System.out.println(st.isempty());
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            System.out.println(st.size());
            st.Display();
            System.out.println(st.isFull());
            st.push(60);
            st.push(70);
            st.push(80);
            st.push(90);
            System.out.println(st.size());
            st.Display();
            st.pop();
            st.pop();
            System.out.println();
            st.Display();
        }
}