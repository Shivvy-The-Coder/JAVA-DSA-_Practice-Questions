public class permutaion_of_Coins 
{
    public static void main(String[] args)
    {
        int []coin={2,3,5};
        int amount=7;    
        print_permutaion(coin, amount," ");
    }
    public static void print_permutaion(int [] coins , int amount , String ans)
        {
            if(amount==0)
                {
                    System.out.println(ans);
                    return;
                }
            if(amount<0)
                return;
            
            for(int i=0;i<coins.length;i++)
                {
                    print_permutaion(coins, amount-coins[i], ans+coins[i]);
                }
        }    
}
