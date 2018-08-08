class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int[] dp=new int[len];
        int max=0;
        int res=0;
        for(int i=0;i<len;i++){
            dp[i]=max;
            max=Math.max(max,height[i]);
        }
        max=0;
        for(int i=len-1;i>=0;i--){
            dp[i]=Math.min(dp[i],max);
            max=Math.max(max,height[i]);
            if(dp[i]-height[i]>0){
                res+=dp[i]-height[i];
            }
        }
        return res;
    }
}