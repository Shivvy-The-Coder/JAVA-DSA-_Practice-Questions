class subsequence_Of_String
{
    public static void main (String args[])
        {
            String s ="abc";
            System.out.println("\n"+subsequence(s,""));
        }
    public static int subsequence(String s,String ans)
        {
            if(s.length()==0)
                {
                    if(ans.length()==0)
                        System.out.print("_ ");
                    else
                        System.out.print(ans+" ");
                    return 1;
                }

            char ch=s.charAt(0);
            String str=s.substring(1);
            int x=subsequence(str,ans);
            int y=subsequence(str,ans+ch);
                return x+y;
        }
}