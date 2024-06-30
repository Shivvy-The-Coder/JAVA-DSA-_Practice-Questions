import java.util.*;
public class Split_Array{
    public static void main(String args[]) 
    {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= {1,2,3,3,4,5};
        int sum=0;
        for(int i=0;i<n;i++)
            {
                sum+=arr[i];
            }
        print_SplitArray(arr,(sum/2),0,"");

    }   
    public static void print_SplitArray ( int []arr ,int sum,int add ,String ans)
            {
                if(add >sum )
                return;
            if(add==sum)
                {
                    System.out.println(ans);
                    return;
                }
            for (int i=0;i<arr.length;i++)
                {
                    ans+=arr[i]+" ";
                    add+=arr[i];
                    print_SplitArray ( arr,sum,add,ans );

                }
        }
}
