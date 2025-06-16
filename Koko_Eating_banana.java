import java.util.Arrays;

public class Koko_Eating_banana {
  public int kokoEat(int[] arr, int k) {
        // code here
        /* Dekho maine pehle binary search soch lia kyunki merko ismi dikh rha tha ki divide
        ki baat ho rhi h
        
        Fir maine template use kia jo mujhe aata tha 
        ifPossible lagana hai 
        
        BS mai low = low
        high = max lena hai 
        
        fir mid nikaal nikaal ke check krna hai ki agar voh itne banana khaaye toh kya
        voh exactly k hrs mai unko khtm kregi ya jyda time legi 
        
        */
        
        int n = arr.length;
        Arrays.sort(arr);
        
        int low = 1;
        int high = arr[n-1];
        
        int ans = -1;
        
        while(low<=high)
        {
            int mid = low +(high- low)/2 ;
            
            if(isPossible(arr , mid , k))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    
    
    private boolean isPossible(int[]arr , int s ,int k)
    {   
        int count =0; 
        
        for(int i=0 ; i<arr.length ;i++)
        {
            if(arr[i] <= s)
            count++;
            else
            count += (arr[i] + s - 1) /s;
        }
        
        
        
        return count<=k;
    }
}
