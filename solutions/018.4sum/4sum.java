class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> res = new LinkedList<>(); 
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
            for(int k=i+1;k<nums.length;k++){
                if(k!=i+1&&nums[k]==nums[k-1])continue;
            int sum =target-nums[i]-nums[k];
            int lo=k+1,hi=nums.length-1;
            while(lo<hi){
                if(nums[lo]+nums[hi]==sum){
                    List<Integer> temp =new LinkedList<>();
                    temp.add(nums[i]);
                    temp.add(nums[k]);
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
        }
            return res; 
        
    }
}