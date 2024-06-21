class subsequence_Of_String
{
    public static void main (String args[])
        {
            String s ="abc";
            subsequence(s,"");
        }
    public static void subsequence(String s,String ans)
        {
            if(s.length()==0)
                {
                    if(ans.length()==0)
                        System.out.print("_ ");
                    else
                        System.out.print(ans+" ");
                    return;
                }

            char ch=s.charAt(0);
            String str=s.substring(1);
            subsequence(str,ans);
            subsequence(str,ans+ch);
        }
}