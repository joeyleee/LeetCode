class Solution{
     public int findUnsortedSubarray(int[] nums){
         int l = nums.length;
         int begin=-1,end=-2,max=nums[0],min=nums[l-1];
         for(int i =1;i<nums.length;i++){
             max=Math.max(nums[i],max);
             min=Math.min(nums[l-i-1],min);
             if(nums[i]<max)end=i;
             if(nums[l-i-1]>min)begin=l-i-1;
         }
         return end-begin+1;
         
     
     }
}
//这个更高
// class Solution{
//     public int findUnsortedSubarray(int[] nums){
//         Stack<Integer> s = new Stack<>();
//         int l=nums.length-1,r=0;
//         for(int i = 0;i<nums.length;i++){
//             while(!s.isEmpty()&&nums[i]<nums[s.peek()])
//                 l=Math.min(l,s.pop());
//             s.push(i);
//             }
//             s.clear();
//         for(int i = nums.length-1;i>=0;i--){
//             while(!s.isEmpty()&&nums[i]>nums[s.peek()])
//                 r=Math.max(r,s.pop());
//             s.push(i);
            
//         }
//         return(r-l>0?r-l+1:0); 
//     }
// }
//该方法时间复杂性比较高
// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         int[] snums = nums.clone();
//         Arrays.sort(snums);
//         int end=0,start=nums.length-1;
//         for(int i = 0; i<nums.length;i++){
//             if(nums[i]!=snums[i]){
//                 end=Math.max(end,i);
//                 start=Math.min(start,i);
//             }
//         }
//         return(end-start>0?end-start+1:0);
        
        
        
//     }
// }