public class quickSort {

    public static void main(String[] args) 
    {
        int arr[]={5,7,2,9,11,6,2,11,3};
        Sort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }    
    public static void Sort(int []arr , int si , int ei)
        {
            if(si>=ei)
                    return;
            int mid = partition(arr,si,ei);
            Sort(arr, si, mid-1);
            Sort(arr, mid+1, ei);
        }
    public static int partition (int arr[],int si , int ei)
        {
            int pivot = arr[ei];
            for (int i=si;i<ei;i++)
                {
                    if(arr[i]<pivot)
                        {
                            int temp = arr[i];
                            arr[i]=arr[si];
                            arr[si]=temp;
                            si++;
                        }
                }

        int temp = arr[si ];
        arr[si] = arr[ei];
        arr[ei] = temp;

        return si; 
        }

}