import java.util.*;
public class vivek_loves_array {
    static int max=Integer.MIN_VALUE;
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = 1;//this is numbert of testcases
        for (int l=0;l<t;l++)
            {
                ArrayList <Integer> ll = new ArrayList<>();
                int arr[]= {1,1,1,1,1,1,1,1,1,1,1,1};
                int n=arr.length;
                for (int i=0;i<n;i++)
                   { 
                        ll.add(arr[i]);
                   }
                split_array(ll,0);
                System.out.println(max);
            }
    }
    public static void split_array(ArrayList<Integer> ll,int count)
        {   int sum1=0;
            for(int i=0;i<ll.size();i++)
            {
                sum1+=ll.get(i);
            } 
            if(ll.size()==1 || sum1==1||sum1%2!=0)
                { max =Math.max(max,count);
                    return;
                }
            int sum2=0;
            ArrayList<Integer> rem = new ArrayList<>();   
            
                for(int i=0;i<ll.size();i++)
                {
                    sum2+=ll.get(0);
                    rem.add(ll.get(0));
                    ll.remove(0);   
                    if(sum2==(sum1/2))
                        {
                            System.out.println(rem +" "+ll);
                            split_array(ll,count+1);
                            split_array(rem,count+1);
                            return;
                        }
                }                 
            

        }
}