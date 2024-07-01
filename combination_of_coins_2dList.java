
import java.util.*;
public class combination_of_coins_2dList {
    public static void main(String[] args)
    {
        int []coin={2,3,5};
        int amount=7;   
        List<List<Integer>> ansr = new ArrayList<>(); 
        List<Integer> ll = new ArrayList<>();
        print_combintaion(coin, amount," ",0,ll,ansr);
        System.out.println(ansr);
    }
    public static void print_combintaion(int [] coins , int amount , String ans,int start, List<Integer> ll, List<List<Integer>> ansr)

        {
            if(amount==0)
                {
                    ansr.add(new ArrayList<>(ll));
                    return;
                } 
            if(amount<0)
                return;
            
            for(int i=start;i<coins.length;i++)
                {
                    ll.add(coins[i]);
                    print_combintaion(coins, amount-coins[i], ans+coins[i],i,ll,ansr);
                    ll.remove(ll.size()-1);
                }
                
        }    
}
