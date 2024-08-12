public class mergeSort {

    public static void main(String[] args) {
        int arr[]={5,7,2,9,11,6,2,11,3};
        int ei=arr.length-1;
        int ans[]=sort(arr,0,ei);
        for (int i=0;i<=ei;i++)
            System.out.print(ans[i]+" ");
    }
    public static int [] sort (int []arr , int si , int ei)
        {
            if(si==ei)
                {
                    int b[]=new int[1];
                    b[0]=arr[si];
                    return b;
                }

            int mid=(si+ei)/2;
            int f[]=sort(arr,si,mid);
            int s[]=sort(arr,mid+1,ei);
            return Merge(f,s);
        }
    public static int [] Merge (int []f, int []s)
        {   int n=f.length;
            int m=s.length;
            int i=0;
            int j=0;
            int k=0;
            int arr[]= new int [n+m];
            while(i<n && j<m)
                {
                    if(f[i]<s[j])
                        {
                            arr[k]=f[i];
                            i++;
                        }
                    else
                        {
                            arr[k]=s[j];
                            j++;
                        }
                        k++;
                }
            while (i<n)
                {
                    arr[k]=f[i];
                    k++;
                    i++;
                }
                while (j<m)
                {
                    arr[k]=s[j];
                    k++;
                    j++;
                }  
            return arr;              
        }
}