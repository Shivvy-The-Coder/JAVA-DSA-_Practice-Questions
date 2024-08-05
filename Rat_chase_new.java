import java.util.Scanner;

public class Rat_chase_new 
{
    static boolean flag =false; 
    public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            // int n=5;
            // int m=4;

            int n=sc.nextInt();
            int m=sc.nextInt();
            char [][]arr = new char[n][m];
            for (int i=0;i<n;i++)
                {
                    String s =sc.next();
                    for ( int j=0;j<m;j++)
                        arr[i][j]=s.charAt(j);
                }
            // char arr [][]={{'o','x','o','o'},
            //                {'o','o','o','x'},
            //                {'x','o','x','o'},
            //                {'x','o','o','x'},
            //                {'x','x','o','o'}

            //               };
            int [][] ansr = new int[n][m];
            Print_path(arr,ansr,0,0);
            if(!flag)
                System.out.println("NO PATH FOUND");
        }   
        public static void Print_path(char[][]arr , int [][]ansr ,int i, int j ) 
        {   
            if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]=='x' )                
                    return;

            
            if(i==arr.length-1 && j==arr[0].length-1)
                {   arr[i][j]='x';
                    ansr[i][j]=1;
                    Display(ansr);
                    flag=true;
                    arr[i][j]='o';
                    ansr[i][j]=1;
                    return;
                }
                arr[i][j]='x';
                ansr[i][j]=1;
                    
            Print_path(arr, ansr, i+1, j);
            Print_path(arr, ansr, i-1, j);
            Print_path(arr, ansr, i, j+1);
            Print_path(arr, ansr, i, j-1);
                arr[i][j]='o';
                ansr[i][j]=1;
        
        }
        public static void Display(int [][]ansr)
        {
            for (int i=0;i<ansr.length;i++) 
                {
                    for (int j=0;j<ansr[0].length;j++)
                        System.out.print(ansr[i][j]+" ");
                    System.out.println();
                }   
        }
        } 

