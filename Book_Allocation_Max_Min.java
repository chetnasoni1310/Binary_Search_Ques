import java.util.*;

public class Book_Allocation_Max_Min {
    public static int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(n<k)
        {
            return -1;
        }
        int low=arr[0];
         int high=0;
        for(int i=0;i<n;i++)
        {   low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        int res=-1;
        while(low<=high)
        {
           int mid=low+(high-low)/2;
           if(BooksAllocated(arr,mid)<=k)
           {
               res=mid;
               high=mid-1;;
           }
           else
           {
               low=mid+1;
           }
          
        }
        return res;
    }
    
    public static int BooksAllocated(int[] arr,int maxPagesAllocated)
    {
        int n=arr.length;
        int student=1;
        int pagesStu=0;
        for(int i=0;i<n;i++)
        {
           if(pagesStu+arr[i]<=maxPagesAllocated)
            {
               pagesStu+=arr[i];
               
            }
           else
           {
               pagesStu=arr[i];
                student++;
           }
        }
        return student;
    }
}
