class jump_game {
    public static void main(String[] args) 
    {
        int nums[]={3,2,1,0,4};
        System.out.println(jump(nums , 0));
    }
    
    public static boolean jump(int[]nums , int idx)
        {   
            
            if(idx>=nums.length)
                return false;
            if(idx==nums.length-1)
                {
                    return true;}
            for(int i=1;i<=nums[idx];i++)
                {                               
                    if (jump(nums , idx+i))
                        return true;

                }
            return false;
        }
}