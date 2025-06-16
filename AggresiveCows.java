import java.util.*;


public class AggresiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        //Using binary search for these kinds of problem 
        
        // first of all we have to do the binary search
        //for min distance between cows int the pattern where this minimum distance is maximum 
        //of all the patterns
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[stalls.length-1]-stalls[0];
        
        while(low<=high)
        {
            int mid=low +(high-low)/2;
            if(canWePlaceAllCows(stalls ,k ,mid))
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return high;
    }
    
    
    
    public static boolean canWePlaceAllCows(int[] stalls ,int k ,int distance)
    {
        
        int CowCount=1;
        //first cow always at 0th index
        int lastCow=stalls[0];
        for(int i=0;i<stalls.length;i++)
        {
            if(stalls[i]-lastCow >=distance)
            {
                CowCount++;
                lastCow=stalls[i];
                
            }
            if( CowCount==k)
            {
                return true;
            }
            
        }
        return false;
    }
}
