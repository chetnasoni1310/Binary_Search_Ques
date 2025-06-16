import java.util.*;
//import java.io.*;



public class SquareRoot  {

public static long floorSqrt(long n) {
    long start=1,end=n;
    long ans=0;
    while(start<=end){
    long mid= start +(end-start)/2;
    ans=0;
    if(mid*mid==n){
        return mid;
    }
    else if(mid*mid>n){
        end=mid-1;
    }
    else{
            start=mid+1;
        ans=end;

    }
    }
    return ans;

}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
long n=sc.nextLong();
 System.out.println(floorSqrt(n) );


sc.close();


}
}