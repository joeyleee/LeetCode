//这个方法可太秀了，大体思想：因为题目是除了自己嘛，还不能用除法，所以呢，就在当前元素的前后分别乘起来，然后然后将前后的元素乘起来，就得到了想要的结果
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0, temp=1 ;i< nums.length; i++){
            result[i]=temp;
            temp*=nums[i];
        }
        for(int i =nums.length-1,temp=1;i>=0;i--){
            result[i]*=temp;
            temp*=nums[i];
        }
      return result;
        
      
        
    }
}