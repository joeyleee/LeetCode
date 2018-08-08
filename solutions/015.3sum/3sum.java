class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>(); 
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
            int sum =0-nums[i];
            int lo=i+1,hi=nums.length-1;
            while(lo<hi){
                if(nums[lo]+nums[hi]==sum){
                    List<Integer> temp =new LinkedList<>();
                    temp.add(nums[i]);
                    temp.add(nums[lo]);
                    temp.add(nums[hi]);
                    res.add(temp);
                    while(lo<hi&&nums[lo]==nums[lo+1])lo++;
                    while(lo<hi&&nums[hi]==nums[hi-1])hi--;
                    lo++;
                    hi--;
                }
                else{
                    if(nums[lo]+nums[hi]<sum){
                        lo++;
                    }
                    else{
                        hi--;
                    }
                }
                
            }
            
        }
            return res;
        
    }
}