// class Solution {
//     public int climbStairs(int n) {
//         int ans[]=new int[n+1];
//         if(n==1)return 1;
//         ans[1]=1;
//         ans[2]=2;
//         for(int i=3;i<=n;i++){
//             ans[i]=ans[i-1]+ans[i-2];
            
//         }
//         return ans[n];
//     }
// }
class Solution {
    public int climbStairs(int n) {
       if(n<=2)return n;
        int a=1,b=2;
        int ans=0;
        for(int i=3;i<=n;i++){
            ans=a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
}
