import java.util.*;
public class Generate_valid_parenthesis1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<String> ll= new ArrayList<>();
        System.out.println("Enter the number of brackets you want ");
        int n=sc.nextInt();
         Generate_valid_parenthesis(n,0,0,ll,"") ;    
         System.out.println(ll);
    }
    public static  void Generate_valid_parenthesis(int n, int open,int close , List<String> ll,String ans)
        {
            if(open>n || close>open)
                return;
            if(open==n && close==n)
                ll.add(ans);
            Generate_valid_parenthesis(n, open+1, close,ll, ans+"(");
            Generate_valid_parenthesis(n, open, close+1,ll,ans+")");
        }
}
