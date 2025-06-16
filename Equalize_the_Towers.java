import java.util.Arrays;

public class Equalize_the_Towers {


    /* 
     * Weighted 
     * Mean
     * Approach
     * HAi 
     * yeh
     * Binary niche milega break ke baad lautenge !!!!
     */
  public int minCost(int[] heights, int[] cost) {
        // code here
        
        /* Dekho sabse pehle toh yeh question hai 
        
        WEIGHTED MEDIAN MINIMIZATION
        
        ka
        ab hum height and cost ko pair krenge 
        fir according to height sort krlenge 
        fir hum saari cost ko add krenge 
        unka half nikaalenge
        fir hum cost ko shuru se add krna start krenge left to right 
        as we go right weight badhega hi ofc kamm toh hoga nhi chaahe 1 se hi badhein
        then we will check ki kab humari cost >= half of total cost hogi
        kyunki jab esa hoga tab hi hum "BALANCING POINT" pe aayenege
        
        */
        
        int h = heights.length;
       
        
        
        //Pairing
        int[][] pair = new int[h][2];
        
        
        //Pair fill up
        for(int i=0;i<h ;i++)
        {  
            pair[i][0] = heights[i];
            pair[i][1] = cost[i];
        }
        
        
        //Sorting them according to height
        Arrays.sort( pair , (a,b) -> Integer.compare( a[0] , b[0] ));
        
        
        //Calculating total cost
        int total = 0;
        for(int[] p : pair)
        {
            total += p[1];
        }
        
        
        //Calculating half
        int half = (total+1)/2;  //+! for correct dividing on odd numbers 
        
        
        //Now traverse through this pair array and check where the cost 
        // will exceed to the half cost
        int curr_cost = 0;
        int medianHeight = -1;
        for(int[] p : pair)
        {
            curr_cost += p[1];
            if( curr_cost >= half)
            {
               medianHeight = p[0];
               break;
            }
        }
        
        
        
        //Ab jo total cost aayegi voh nikaal lo 
        int result=0;
        for(int[] p : pair)
        {
            result += Math.abs(p[0] - medianHeight) * p[1];
        }
        
        
        return result;
    }
}
