import java.util.*;
//import java.io.*;



public class Kth_missing_In_sortedArray {

    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(k>arr[mid]-(mid+1))
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }
        
        
        // int missingMore=arr[high]-(high+1);
        // int addNext=k-missingMore;
        // final answer=arr[high]+addNext;
        
        //if i solve the above 3 equations i will found out it as
        // arr[high] + k -(arr[high]-(high+1))
        // = high+1+k
        // = low+k     as beacause the high + will point to low 
        return low+k;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}