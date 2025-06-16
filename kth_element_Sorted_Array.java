public class kth_element_Sorted_Array {
    public int kthElement(int a[], int b[], int p) {
        // code here
        
        int[]comb=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                comb[k]=a[i];
                k++;
                i++;
            }
            
            else
            {
                comb[k]=b[j];
                k++;
                j++; 
            }
        }
       while(i<a.length)
        {
            comb[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length)
        {
            comb[k]=b[j];
            k++;
            j++;
        }
        return comb[p-1];
    }
}
