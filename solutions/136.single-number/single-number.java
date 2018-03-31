// class Solution {
//     public int singleNumber(int[] nums) {
//         HashSet<Integer> result = new HashSet<Integer>();
//         for(int i =0;i<nums.length;i++){
//             if(!result.remove(nums[i])){
//                 result.add(nums[i]);
//             }
//              }
//         return result.iterator().next();
//         }
// }

//这个方法非常牛逼了
class Solution {
  public int singleNumber(int[] nums) {
      int a=0;  
      for(int i =0;i<nums.length;i++){
        a ^=nums[i];
        }
return a;
  }
}