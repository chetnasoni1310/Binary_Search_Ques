import java.util.Arrays;

public class Smallest_Divisor {
 int smallestDivisor(int[] arr, int k) {
        // Code here
        
        
        /*
        Ab dekho yeh bhi min max and max min wala ques hai 
        min = 1
        max = max number from array 
        
        fir iss range mai binary search lagao 
        fir agar summ k ya usse chota aaya toh voh possible answer ho skta hai 
        fir isPossible ko implement kro 
        fir ussko lower krke dekho 
        fir nhi hua toh firse higher krke dekho 
        fir return krdo 
        */
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int low = 1;
        int high = arr[n-1];
        
        int ans = -1;
        
        while(low <= high)
        {
            int mid = low +(high - low)/2;
            
            if( isPossible(mid , arr , n , k) )
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
            
        }
       return ans; 
    }
    
    private boolean isPossible(int d , int[]arr , int n ,int k )
    {
        int sum = 0;
        for(int i=0;i<n;i++)
        { 
            int ceil = (arr[i] + d - 1)/d ;
            sum += ceil ;
        }
        
        return sum<=k ;
     
    }
}
