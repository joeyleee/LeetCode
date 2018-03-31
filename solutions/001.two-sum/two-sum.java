class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }         
        for(int i=0; i<nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x)&&map.get(x)!=i){
                return new int[] {i,map.get(x)};
            }
            
        }
         throw new IllegalArgumentException("No two sum solution");
        
    }
}