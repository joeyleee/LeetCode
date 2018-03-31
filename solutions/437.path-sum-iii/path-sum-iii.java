/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root==null)return 0;
        return culSum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
        }
    public int culSum(TreeNode node,int sum){
        if(node==null)return 0;
        sum=sum-node.val;
        return (sum==0?1:0)+culSum(node.left,sum)+culSum(node.right,sum);
            
        
    }
}