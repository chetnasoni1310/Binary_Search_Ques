import java.util.*;
//import java.io.*;



public class Search_Row_Wise_Sorted_Matrix {

    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            if(search(mat[i],x))  ///Checkkaro iss row m hai ya nahi through binary search s
            {
                return true;
            }
        }
        return false;
}


public static boolean search(int[]arr,int x)
{
    int low=0;
    int n=arr.length;
    int high=n-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(x==arr[mid])
        {
            return true;
        }
        else if(x>arr[mid])
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    return false;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}