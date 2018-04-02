class Solution {
    public int rob(int[] nums) {
        int yes=0,no=0,temp;
        for(int n:nums){
            temp=no;
            no=Math.max(yes,no);
            yes=temp+n;
        }
        return Math.max(yes,no);
        
        
    }
}