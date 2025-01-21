class Grumpy_bookstore_owner {
    public static void main(String args[])
    {
        int[] customers={1,0,1,2,1,1,7,5};
        int[] grumpy={0,1,0,1,0,1,0,1};
        int minutes=3;
        System.out.println(maximum_satisfied_customer(customers,grumpy, minutes));

    }
    public static int maximum_satisfied_customer(int[] customers, int[] grumpy, int minutes)
        {
            int ei=0,si=0,sum=0,k=0,max=Integer.MIN_VALUE;
            int n=customers.length;
            int i=0;
            
            while(ei<n)
                {
                    // grow
                        sum+=customers[ei];
                        k++;
                    // shrink
                        if(k>3)
                            {
                                sum-=customers[si];
                                si+=1;
                                k--;
                            }

                    // update   
                        if(sum>max)
                            {
                                max=sum;
                                i=si;
                            }
                            ei++;
                        
                }
                sum=0;
                for(int x=0;x<customers.length;x++)
                    {
                        if(x>=i && x<=(i+(minutes-1)) )
                            {
                                sum+=customers[x];
                            }
                        else 
                        {
                            if(grumpy[x]!=1)
                                sum+=customers[x];
                        }
                    }
                    return sum;
        }
        
}