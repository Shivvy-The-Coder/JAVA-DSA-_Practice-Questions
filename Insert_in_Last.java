import java.util.Stack;

/**
 * Insert_in_Last
 */
public class Insert_in_Last {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);

        System.out.println(st);
        ans(st);
        System.out.print(st);
    }
     public static void ans(Stack <Integer> st)
     {
        if(st.isEmpty())
            {
                st.push(-7);
                return;
            }   
        int a=st.pop();
        ans(st);
        st.push(a);
     }
}