import java.util.*;
public class next_Greater_Element {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        int arr[]={50,5,3,2,8,7,9,11,3};
        st.push(0);
        for(int i=1;i<arr.length;i++)
            {   
                    
                while(!st.isEmpty() && arr[i]>arr[st.peek()])
                    {
                        arr[st.pop()]=arr[i];
                    }
                    st.push(i);
            }
        while(!st.isEmpty())
            arr[st.pop()]=-1;

        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
}
