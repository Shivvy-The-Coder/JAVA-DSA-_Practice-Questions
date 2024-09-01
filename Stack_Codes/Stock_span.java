

/**
 * Stock_span
 */
import java.util.Stack;
 public class Stock_span 
{
public static void main(String[] args) {
    int arr[]={50,5,3,2,8,7,9,11,8};
    for (int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
    System.out.println();
    Stack <Integer> st = new Stack<>();
    st.push(0);
    int idx=0;
    int ans[]= new int[arr.length];
    for (int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }
            if(!(st.isEmpty()))
                {
                    ans[i]=i-st.peek();
                }
            else
                {
                    ans[i]=i+1;
                }
            st.push(i);
        }
    for (int i=0;i<arr.length;i++)
        System.out.print(ans[i]+" ");
}
    
}