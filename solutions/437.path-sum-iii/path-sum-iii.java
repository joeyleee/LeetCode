/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// class Solution {
//     public int pathSum(TreeNode root, int sum) {
//         if(root==null)return 0;
//         return culSum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
//         }
//     public int culSum(TreeNode node,int sum){
//         if(node==null)return 0;
//         sum=sum-node.val;
//         return (sum==0?1:0)+culSum(node.left,sum)+culSum(node.right,sum);
            
        
//     }
// }
//此方法速度更快，减少了很多重复操作
class Solution {
    public int pathSum(TreeNode root, int sum) {
         HashMap<Integer,Integer> preSum = new HashMap<>();
         preSum.put(0,1);
         return subSum(root,0,sum,preSum);
     }
    public int subSum(TreeNode node,int cur,int sum,HashMap<Integer,Integer> preSum){
        if(node==null)return 0;
        cur+=node.val;
        int res=preSum.getOrDefault(cur-sum,0);
        preSum.put(cur,preSum.getOrDefault(cur,0)+1);
        res +=subSum(node.left,cur,sum,preSum)+subSum(node.right,cur,sum,preSum);
        preSum.put(cur,preSum.get(cur)-1);
        return res;
        
    }
}