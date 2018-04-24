class Solution {
    int res=0;
    public int findTargetSumWays(int[] nums, int S) {
        findSub(nums,S,0,0);
        return res;
    }
    public void findSub(int[] nums,int S,int cur,int l){
        if(l==nums.length){
            if(cur==S){
                res++;
            }
        
        }
        else{
        findSub(nums,S,cur+nums[l],l+1);
        findSub(nums,S,cur-nums[l],l+1);
        }        
    }
}