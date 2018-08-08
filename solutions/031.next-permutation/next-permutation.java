class Solution {
    public void nextPermutation(int[] nums) {
        int prev=-1;
        int suffix=-1;
        for(int i=nums.length-1;i>0;i--){
           if(nums[i]>nums[i-1]){
               prev=i-1;
               break;
           }
       }
        if(prev==-1){
           reverse(nums,0);
           return;
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]>nums[prev]){
                suffix=j;
                swap(nums,prev,suffix);
                break;
            }
        }
        reverse(nums,prev+1);
        
    }
    public void  reverse(int[] nums,int start){
        int i=start,j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
}