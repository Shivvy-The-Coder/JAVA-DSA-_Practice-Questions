class N_Queen
{
    public static void main(String[] args) 
    {
        int n=8;
        boolean [][] check = new boolean[n][n];
        Queen(check,n,0);
    }
    public static void Queen(boolean [][] check, int tq , int row)
        {
          if(tq==0)
            {
                Display(check);
                System.out.println();
                return;
            }  
        if(row>=check.length)
            return;
          for (int col=0;col<check[0].length;col++)
            {
                if(safe(check ,row,col))
                    {
                        check[row][col]=true;
                        Queen(check, tq-1,row+1);
                        check[row][col]=false;
                    }

            }
        }

    public static void Display(boolean [][]check)
        {
            for (int i=0;i<check.length;i++)
                {
                    for(int j=0;j<check[0].length;j++)
                        {
                            // System.out.print(check[i][j] +" ");
                            if(check[i][j])
                                System.out.print('Q');
                            else
                                System.out.print('_');
                        }
                        System.out.println();
                }
        }
    

    public static boolean safe(boolean [][] check , int row , int col)
        {
            int r,c;
            r=row;
            while(r>=0)
                {
                    if(check[r][col]==true)
                        return false;
                    r--;
                }

            r=row;c=col;
                while (r>=0 && c>=0)
                {
                    if(check[r][c]==true)
                        return false;                   
                    r--;
                    c--;
                }
            
                r=row;c=col;
                while (r>=0 && c<check[0].length)
                {
                    if(check[r][c]==true)
                        return false;
                    
                    r--;
                    c++;
                }
                return true;
        }
}