/*
这道题的思路是我们想要求得的是sum(i,j)，他可以通过sum(0,j)-sum(0,i)得到，这样我们只需要遍历一遍数组就可以得到结果，否则使用
暴力解法需要n方的时间复杂度
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        int sum=0;
        Map<Integer,Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(preSum.containsKey(sum-k)){
                res+=preSum.get(sum-k);
            }
            preSum.put(sum,preSum.getOrDefault(sum,0)+1);
            
        }
        return res;
    }
      
}