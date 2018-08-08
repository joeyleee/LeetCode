class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
            int lo=i+1,hi=nums.length-1;
            while(lo<hi){
                int sum =nums[i]+nums[lo]+nums[hi];
                if(Math.abs(sum-target)<Math.abs(res-target))res=sum;
                if(sum-target>0)hi--;
                else lo++;
            }
        }
        return res;
    }
}