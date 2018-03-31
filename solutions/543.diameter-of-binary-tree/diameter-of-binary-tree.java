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
   
    private int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
       maxDepth(root);
        return ans;
    }
    public int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        ans=ans>left+right?ans:left+right;
        return left>right?left+1:right+1; 
        
    }
}

