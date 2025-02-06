import java.util.Stack;

/**
 * ReverseStack
 */
public class ReverseStack {

    public static void main(String[] args) 
    {
        // below we are creating the stack object.
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);     
    }
    public static void Reverse(Stack <Integer> st)
        {
            if(st.isEmpty())
                return;
            int x=st.pop();
            Reverse(st);
            addLast(st, x);
        }
    public static void addLast(Stack <Integer> st , int item)
        {
            if(st.isEmpty())
                {
                    st.push(item);
                    return;
                }
            int x=st.pop();
            addLast(st, item);
            st.push(x);
        }
}