import java.util.Arrays;

public class _2616_Max_the_Min_Abs_Diff {
 public int minimizeMax(int[] nums, int p) {
        /*Key Observation 
        1. Max to min ya min to max ho toh binary search lagega
        2. Low = 0
        High = Max diff possible ( max element - min element )
        fir mai mid nikaalungi 
        fi check krungi ki agar voh max difference hota toh 

        3. Maine heap ka use lene ka socha tha but the problem was 
        ❌ 1. Index reuse ho sakta hai:
    Heap se p smallest pairs uthane mein tum ensure nahi kar rahi ho ki koi
     index repeat na ho.
    Aur question clearly bolta hai:

    “No index appears more than once in the p pairs.”


        
        */

        if(p==0)
        return 0;
        
        int n = nums.length;

        Arrays.sort(nums);

        int low = 0;
        int high = nums[n-1] - nums[0];
        
        int ans = -1; 

        while(low <= high)
        {
           int mid = low + (high - low)/2 ;

           if(isPossible(nums , mid , p))
           {
              ans = mid ;
              high = mid - 1;
           }
           else
           {
            low = mid + 1;
           }
        }
        return ans ;
    }

    private boolean isPossible(int[]nums , int maxDiff ,int p)
    {
        int count = 0 ; //Kitne satisfying pairs mil gye
        int i=0;
        while(i < nums.length - 1)
        {   
            int diff = nums[i+1] - nums[i];
            if( diff <= maxDiff)
            {
                count++;
                i+=2;
                
            }
            else
            i++;
        }

        return count>=p;
    }
}
