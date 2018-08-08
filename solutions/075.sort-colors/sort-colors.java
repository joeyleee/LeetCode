/*
解法一：遍历一遍数组，记录下0，1,2的个数，然后再遍历一遍数组重写该数组
解法二：只遍历一般数组，在过程中交换0和2的位置，需要注意的是交换2的时候，交换回来的数可能还是不满足条件的，此时遍历不能向前推进
*/
class Solution {
    public void sortColors(int[] nums) {
        int two=nums.length-1;
        int zero=0;
        int i=0;
        while(i<=two){
           if(nums[i]==2){
               nums[i]=nums[two];
               nums[two]=2;
               two--;
               continue;
           }
            if(nums[i]==0){
               nums[i]=nums[zero];
               nums[zero]=0;
              zero++;
           }
            i++;
        }            
    }
}