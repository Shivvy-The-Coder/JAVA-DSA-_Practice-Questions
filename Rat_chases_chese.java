import java.util.*;
public class Rat_chases_chese 
{
    static boolean  flag=false;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);      
    int n=sc.nextInt();
    int m=sc.nextInt(); 
    char maze[][]=new char[n][m];
    int  ansr[][]= new int[n][m];    
    for (int i=0;i<maze.length;i++)
        {
            String s =sc.next();
            for (int j=0;j<s.length();j++)
                {
                    maze[i][j]=s.charAt(j);
                }
        }
                        print_path(maze, "", 0, 0,ansr);    
                        if(flag==false)
                            System.out.println("No path found"); 
         sc.close();               
    }
    
    public static void print_path(char [][]maze , String ans, int i , int j,int ansr [][])
        {
            if( i<0|| j<0 || i>=maze.length|| j>=maze[0].length)
                return;
            if(i==maze.length-1 && j==maze[0].length-1 && maze[i][j]!='x')  
                {
                    ansr[i][j]=1;
                    Display(ansr);
                    flag=true;
                    ansr[i][j]=0;
                    return;
                }

            int dR[]={-1,1,0,0};
            int dC[]={0,0,-1,1};
            if(maze[i][j]!='x')
           { 
            maze[i][j]='x';
            ansr[i][j]=1;
                for(int k=0;k<dC.length;k++)
                print_path(maze,ans, i+dR[k],j+dC[k],ansr);
            maze[i][j]='o';
            ansr[i][j]=0;
          }
        }
        public static void Display(int [][]ansr)
            {
                for (int i=0;i<ansr.length;i++)
                            {
                                for(int j=0;j<ansr[0].length;j++)
                                    System.out.print(ansr[i][j]+" ");
                                System.out.println();
                            }
            }
}
