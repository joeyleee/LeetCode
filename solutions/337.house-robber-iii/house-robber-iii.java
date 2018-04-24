/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//类似这种最优子结构和重复子问题的题目，要用dp算法解答，要记住,用一些数据结构记住中间结果，防止重复运算。
public class Solution {
    public int rob(TreeNode root) {
        if(root==null)return 0;
        int res[] = robSub(root);
        return Math.max(res[0],res[1]);
    }
    public int[] robSub(TreeNode root){
        if(root == null)return new int[2];
        int left[]=robSub(root.left);
        int right[]=robSub(root.right);
        int res[] = new int[2];
        res[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        res[1] = root.val+left[0]+right[0];
        return res;
    }
}