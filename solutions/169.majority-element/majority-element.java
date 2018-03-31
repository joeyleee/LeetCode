// class Solution {
//     public int majorityElement(int[] nums) {
//         int x=0;
//         int y=0;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(!map.containsKey(nums[i])){
//                 map.put(nums[i],1);
//                 }
//             else{
//                 map.put(nums[i],map.get(nums[i])+1);
//             }
        
//     }
        
//         Map.Entry<Integer, Integer> majorityEntry = null;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
//                 majorityEntry = entry;
//             }
//         }
//        return majorityEntry.getKey();
//      }
// }
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
   
}