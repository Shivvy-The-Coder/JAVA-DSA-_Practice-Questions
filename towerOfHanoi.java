class towerOfHanoi
{
    public static void main(String[] args)
    {
        int n=3;
        String src="A";
        String des="C";
        String hlp="B";
        tower(n,src,hlp,des);    
    }
   public static void  tower(int n , String src , String hlp , String des)
    {
        if(n==0)
            return;
        
        tower(n-1, src, des, hlp);
        System.out.println("Moving "+n+"th disc from "+src+" to destination "+des);
        tower(n-1, hlp, src, des);
    }
}