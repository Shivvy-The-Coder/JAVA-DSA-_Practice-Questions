public class combination_of_Coins 
{
    public static void main(String[] args)
    {
        int []coin={2,3,5};
        int amount=7;    
        print_combintaion(coin, amount," ",0);
    }
    public static void print_combintaion(int [] coins , int amount , String ans,int start)
        {
            if(amount==0)
                {
                    System.out.println(ans);
                    return;
                }
            if(amount<0)
                return;
            
            for(int i=start;i<coins.length;i++)
                {
                    print_combintaion(coins, amount-coins[i], ans+coins[i],start+1);
                }
        }    
}
