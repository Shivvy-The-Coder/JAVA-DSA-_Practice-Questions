import java.util.*;
public class permutation_of_String 
{
    public static void main(String[] args) 
    {   
        ArrayList<String>ll= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        permutation(s,ll,"");
        System.out.println(ll);
    }    
    public static void permutation(String s,ArrayList<String>ll, String ans)
        {   
            int n=s.length();
            
            if(n==0)
                {
                    ll.add(ans);
                    return;    
                }
            
            for (int i=0;i<n;i++)
                {   boolean checked =false;
                    char ch=s.charAt(i);

                    for(int j=i+1;j<s.length();j++)
                        {
                            if(s.charAt(j)==ch)
                                checked=true;
                        }
                    if(checked==false)
                    {
                    String s1=s.substring(0,i);
                    String s2=s.substring(i+1);                    
                    permutation(s1+s2,ll, ans+ch);
                    }
                }
        }
}