class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=findFirst(nums,target);
        res[1]=findLast(nums,target);
        return res;
    }
    public int findFirst(int[] nums,int target){
        int res=-1;
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(nums[mid]==target)res=mid;
        }
        return res;
    }
    public int findLast(int[] nums,int target){
        int res=-1;
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            if(nums[mid]==target)res=mid;
        }
        return res;
        
    }
}
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] res={-1,-1};
//         int start=0,end=nums.length-1;
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(nums[mid]==target){
//                 res[0]=mid;
//                 res[1]=mid;
//                 while(res[0]>=0&&nums[res[0]]==target)res[0]--;
//                 while(res[1]<nums.length&&nums[res[1]]==target)res[1]++;
//                 res[0]++;
//                 res[1]--;
//                 return res;
//             }
//             if(target>nums[mid]){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return res;
//     }
// }