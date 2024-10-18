package Stack_Codes;
import java.util.Stack;

public class maximum_Area {

    public static void main(String[] args) {
        int arr[]={2,3,5,4,6,1,7};
        Stack <Integer> st = new Stack<>();
        int area=0;
        for (int i=0;i<arr.length;i++)
            {
                while(!st.isEmpty() && arr[i]<arr[st.peek()])
                    {
                        int h=arr[st.pop()];
                        int r=i;
                        if(!st.isEmpty())
                            {
                                int l=st.peek();
                                area=Math.max(area,h*(r-l-1));
                            }
                        else
                            {
                                area=Math.max(area,h*r);
                            }
                    }
                    st.push(i);
            }
        System.out.println(area);
    }
}