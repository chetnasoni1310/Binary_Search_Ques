public class K_Closest_Element {
 /**Sabse pehle toh k size ka array bna do 
         Fir ab ......
         Binary search laga ke x ko dhundho 
         agar mil gya toh i and j pointer start krke array m fill krdo elements 
         
         Nahi mila toh lower ya upper bound se start krdo 
         
         then continue 2 pointer approach 
         
         */
        public int[] BS(int[]arr , int k ,int x)
        { 
        int[] result = new int[k];


        
        int index = ClosestIndex(arr , x);
        
        
        
        int i = index;
        int j = index + 1;
    
        // Skip x if it exists
        if (i >= 0 && arr[i] == x) {
            i--;
        }
            
            
            
            
        int position = 0;
        
        
        while(k>0 && i>=0 && j<arr.length )
        {
         
           int choice1 = Math.abs(x - arr[i]);
           
           
           int choice2 = Math.abs(x - arr[j]);
            
            if(choice1 < choice2 )
            {
                result[position] = arr[i];
                i--;
            }
            else if(choice1 > choice2)
            {
                 result[position] = arr[j]; 
                 j++;
            }
            else
            {       if(arr[i] > arr[j])
                    {
                        result[position] = arr[i];
                        i--;
                    }
                    else
                    {
                       result[position] = arr[j];
                        j++;        
                    }
            }
            
            
            position++;
            k--;
        }
        
      while(position != result.length && i>=0)
            {
                result[position++] = arr[i--];
            }
        
        
        
          while(position != result.length && j<arr.length)
            {
                result[position++] = arr[j++];
            }
       
        
        
         return result;
    }
    
    private int ClosestIndex(int[]arr , int x)
    {
        int high = arr.length -1 ;
         int low =  0;
         
         while(low<=high)
         {
             int mid = low + (high - low)/2 ;
             
             if(arr[mid] == x)
             {
                 return mid;
             }
             else if(arr[mid] > x)
             {
                high = mid-1; 
             }
             else
             {
                low = mid+1; 
             }
         }
         return high;
    }
}
