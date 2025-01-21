import java.util.*;
class Solution {
    public String smallestNumber(String pattern) 
    {
        Stack <Integer> st = new Stack<>();
        int ans[]= new int[pattern.length()+1];
        int count=1;
        for (int i=0;i<=pattern.length();i++)
            {
                if(i==pattern.length() || pattern.charAt(i)=='I')
                    {
                        ans[i]=count;
                        count++;
                        while(!st.isEmpty())
                            {
                                ans[st.pop()]=count;
                                count++;
                            }
                    }
                else
                    {   
                        st.push(i);
                    }

            }
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<ans.length;i++)
                sb.append(ans[i]);
        return sb.toString();
    }
}