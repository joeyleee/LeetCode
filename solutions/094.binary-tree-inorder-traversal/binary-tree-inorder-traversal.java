/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//这道题比一般的easy题还要简单！
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        LinkedList<Integer> res = new LinkedList<>();
        TreeNode node=root ;
        
        while(node!=null||!s.isEmpty()){
        while(node!=null){
            s.push(node);
            node=node.left;
            
        }
        node=s.pop();
        res.add(node.val);
        node=node.right;
        
            
        
        }
        return res;
        
        
        
    }
}