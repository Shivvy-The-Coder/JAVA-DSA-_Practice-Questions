import java.util.*;
class Solution {
    public static void main(String []args)
    {
        int n=13;
        List<Integer> ll= new ArrayList<>();
        order(0,n,ll);
        System.out.println(ll);
    }
    public static void order(int ans , int n, List<Integer>ll)
        {
            
            if(ans>n)
                {
                    return;
                }
            ll.add(ans);
            int i=0;
            if(ans==0)
                i=1;
            
            for(;i<=9;i++)
                {
                    order((ans*10)+i, n,ll);
                }
        }
}