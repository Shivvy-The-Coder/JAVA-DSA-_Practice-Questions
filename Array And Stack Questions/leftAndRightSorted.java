class leftAndRightSorted
{
    public static void main(String[] args) {
        int arr[]={5,7,2,1,8,3,4};
        int si=0,ei=arr.length-1;
        int val=arr[ei];

        for(int i=0;i<ei;i++)
            {
                if(val>arr[i])
                    {
                        int temp = arr[i];
                        arr[i]=arr[si];
                        arr[si]=temp;
                        si++;
                    }
            }
        int temp = arr[si];
        arr[si]=arr[ei];
        arr[ei]=temp;
            for (int i=0;i<=ei;i++)
                System.out.print(arr[i]+" ");
    }
}