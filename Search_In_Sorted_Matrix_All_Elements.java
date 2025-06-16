import java.util.*;
//import java.io.*;



public class Search_In_Sorted_Matrix_All_Elements {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row=mat.length;
        int col=mat[0].length;
        int low=0;
        long high=(long)row*col -1;
        while(low<=high)
        {
            int mid=low+(int)(high-low)/2;
            int r=mid/col;
            int c=mid%col;
            if(mat[r][c]==x)
            {
                return true;
            }
            else if(x>mat[r][c])
            {
                low=mid+1;
            }
            else{
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