public class Permutation_queen 
{
    public static void main(String[] args) 
    {
            int tq=2;
            int n=4;   
            boolean board[]=new boolean[n];        
            Print_permutation(board, tq ,"" , 0);
    }    
    public static void Print_permutation(boolean[] board, int tq , String ans , int qpsf)
        {
            if(qpsf==tq)
            {
                System.out.println(ans);
                 return;
            }
            for(int i=0;i<board.length;i++)
                {
                    if(board[i]==false)
                        {
                            board[i]=true;
                            Print_permutation(board, tq, ans+"b"+i+"q"+qpsf , qpsf+1);
                            board[i]=false;
                        }
                }
            
        }

}
