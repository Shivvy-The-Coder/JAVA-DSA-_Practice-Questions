// import java.util.*;

class mergeTwoSortedArrays
{
    public static void main(String[] args) {
        int arr1[]={3,5,7,9,11};
        int arr2[]={1,2,3,4,6,7};
        
        int n=arr1.length;
        int m=arr2.length;
        int ans[]= new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
                {
                    ans[k]=arr1[i];
                    i++;
                }
            else
                {
                    ans[k]=arr2[j];
                    j++;
                }
            k++;
        }
        while(i<n)
            {
                ans[k]=arr1[i];
                i++;
                k++;
            }
            while(j<m)
            {
                ans[k]=arr2[j];
                j++;
                k++;
            }
            for (int x=0;x<(n+m);x++)
                {
                    System.out.print(ans[x]+" ");
                }
    }
}