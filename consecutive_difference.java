public class consecutive_difference 
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("HEllow");
        System.out.println(sb.deleteCharAt(2));
        for (int i=0;i<10;i++)
             printl(1, 2, i, 0);
    }   
    public static void printl(int k , int len, int ans, int count)
        {
                // System.out.println((ans%10 +k )+" "+ (ans%10-k));
                if(ans==0)
                    return;
            if(count ==len-1)
                {   
                    System.out.println(ans);
                return;}
                if (ans % 10 + k <= 9) 
                printl(k, len, ans * 10 + (ans % 10 + k), count + 1);
            if (ans % 10 - k >= 0)  
                printl(k, len, ans * 10 + (ans % 10 - k), count + 1);
            }
}

