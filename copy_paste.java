class Solution {
    static int count=0;
    public static void main (String args[]) 
    {
        int n=3;
        String q="A";
        copy_paste(n,q,"",true);
        System.out.println(count);
    }
    public static void copy_paste(int n , String ans, String copy,boolean check)
        {
            if(ans.length()>=n)
                {
                    return ;
                }                      
                    copy_paste(n,ans,ans,true);
                    copy_paste(n,ans+copy,copy,false);        
                        count++;
            }
}