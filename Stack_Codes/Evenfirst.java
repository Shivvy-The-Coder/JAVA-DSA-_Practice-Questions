package Stack_Codes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Evenfirst
 */
public class Evenfirst {
 public static void main (String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> Q = new LinkedList<Integer>();
        int n=7;
        ArrayList<Integer> ll= new ArrayList<>();
            // {   int in=sc.nextInt();
                ll.add(6);
                ll.add(8);
                ll.add(10);
                ll.add(1);
                ll.add(3);
                ll.add(5);
                ll.add(6);

        System.out.println(ll);
        int val=0;
        for (int i=0;i<n;i++)
            {
              if(ll.get(i)%2!=0)
                {
                    Q.add(ll.get(i));
                    val++;
                }
            }
            for (int i=0;i<n-val;i++)
            {
              if(ll.get(i)%2!=0)
                {
                    ll.remove(i);
                }
                n=ll.size();
            }   
        int k=0;
        while(!(Q.size()==0))
        {
            ll.add(k,Q.remove());
            k++;
        }
        for(int i:ll)
            System.out.print(i+" ");
            sc.close();
    }
}