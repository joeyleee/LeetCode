//第二次没看答案做出一道题，竟然还是动态规划，，距离上一次没看答案的时间是一天前
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],sum=0;
    
        for(int n=0;n<nums.length;n++){
            sum+=nums[n];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
               }
        }
        return max;
        
        
    }
}