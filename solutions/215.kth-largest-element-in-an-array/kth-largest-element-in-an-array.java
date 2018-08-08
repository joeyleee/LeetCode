class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = quickSort(nums,0,nums.length-1,k);
        return result;
    }
    public int quickSort(int[] a,int low,int high,int k){
        int pivot =low-1;
        int i=low,j=high;
        while(i<=high){
            if(a[i]>=a[high]){
                pivot++;
                int temp=a[i];
                a[i]=a[pivot];
                a[pivot]=temp;
            }
             i++;        
        }
        int m=pivot-low+1;
        if(m==k)return a[pivot];
        if(m>k)return quickSort(a,low,pivot-1,k);
        else return quickSort(a,pivot+1,high,k-m);
        
        
    }
}