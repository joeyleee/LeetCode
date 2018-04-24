//该算法运用了快慢指针的思想，非常巧妙，值得深思。
class Solution {
    public int findDuplicate(int[] nums) {
       int fast=nums[0],slow=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
      
        
    }
}