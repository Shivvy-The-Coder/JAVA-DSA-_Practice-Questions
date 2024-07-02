import java.util.*;
public class Rat_chases_chese 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
       
       char maze [][]={
                          {'o','x','o','x'},
                          {'o','o','o','x'},
                          {'x','o','x','o'},
                          {'x','o','o','x'},
                          {'x','x','o','x'}
                        };     

        int ansr [][]= new int[5][4];          
    // int n=sc.nextInt();
    // int m=sc.nextInt(); 
    // char maze[][]=new char[n][m];
    // for (int i=0;i<maze.length;i++)
    //     {
    //         String s =sc.next();
    //         for (int j=0;j<s.length();j++)
    //             {
    //                 maze[i][j]=s.charAt(j);
    //             }
    //     }
                        print_path(maze, "", 0, 0,ansr);     
                        
    }
    public static void print_path(char [][]maze , String ans, int i , int j,int ansr [][])
        {
            if( i<0|| j<0 || i>=maze.length|| j>=maze[0].length)
                return;
            if(i==maze.length-1 && j==maze[0].length-1)  
                {
                    System.out.println(ans+i+","+j+" ");
                    Display(ansr);
                    return;
                }
            if(maze[i][j]!='x')
           { 
            maze[i][j]='x';
            ansr[i][j]=1;
            print_path(maze, ans+i+","+j+" ", i-1, j,ansr); //going up
            print_path(maze, ans+i+","+j+" ", i+1, j,ansr); //going down
            print_path(maze, ans+i+","+j+" ", i, j-1,ansr); //going down
            print_path(maze, ans+i+","+j+" ", i, j+1,ansr); //going right
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
