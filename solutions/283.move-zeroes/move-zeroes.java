// class Solution {
//     public void moveZeroes(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 for(int j=i+1;j<nums.length;j++){
//                     if(nums[j]!=0){
//                         int temp = nums[i];
//                         nums[i]=nums[j];
//                         nums[j]=temp;
//                         break;
//                     }
//                     else
//                         continue;
//                 }
                
//             }
//             else
//                 continue;
            
//         }
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {
        
       for(int n=0,i=0;i<nums.length;i++){
           if(nums[i]!=0){
               int temp =nums[i];
               nums[i]=nums[n];
               nums[n++]=temp;
           }
       }
          
       
    }
}
        
