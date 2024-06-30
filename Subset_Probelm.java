import java.util.*;
public class Subset_Probelm {
    public static void main(String args[]) 
    {
        // Your Code Here
        Scanner sc = new Scanner (System.in);
        int n=5;
        int arr[]={1,3,2,3,4};
        String s="";
        for(int i=0;i<n;i++)
            {
                s=s+arr[i];
            }
        int a=5;
        System.out.println( "\n"+count_subset(0,"",s,a));
    }
    public static int count_subset(int ans,String an, String ques, int a)
        {
            if(ans==a)
            {
                System.out.print(an+" ");
                return 1;
            }
            if(ans>a||ques.length()==0)
                return 0;

            int count=0;
            for(int i=0;i<ques.length();i++)
                {
                    int ch=ques.charAt(i)-'0';
                    count+=count_subset(ans+ch, an+ch+" " , ques.substring(i+1),a);
                }
                return count;
        }
}
