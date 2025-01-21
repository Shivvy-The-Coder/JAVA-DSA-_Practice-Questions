public class possible_path_2dArray 
{
    public static void main(String[] args) {
        int m=3;
        int n=3;
        possible_path(0,0,"",m,n);
    }    
    public static void possible_path(int h,int v, String ans , int m ,int n)
    {
        if(h>m-1||v>n-1)
            return;
        if(h==m-1 && v==n-1)
            System.out.println(ans);
        possible_path(h+1, v, ans+"H", m, n);
        possible_path(h, v+1, ans+"V", m, n);
    }
}
