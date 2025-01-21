import java.util.*;
public class combination_of_Coins 
{
    public static void main(String[] args)
    {
        int []coin={2,3,5};
        int amount=7;   
        List<Integer> ll = new ArrayList<>();
        print_combintaion(coin, amount," ",0,ll);
    }
    public static void print_combintaion(int [] coins , int amount , String ans,int start, List<Integer> ll)

        {
            if(amount==0)
                {
                    System.out.println(ll);
                    return;
                } 
            if(amount<0)
                return;
            
            for(int i=start;i<coins.length;i++)
                {
                    ll.add(coins[i]);
                    print_combintaion(coins, amount-coins[i], ans+coins[i],i,ll);
                    ll.remove(ll.size()-1);
                }
                
        }    
}
