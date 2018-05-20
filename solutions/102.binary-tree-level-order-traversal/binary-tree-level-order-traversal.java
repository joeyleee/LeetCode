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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        TreeNode last=root,nlast=root,node;
        qu.add(root);
        ArrayList<Integer> temp = new ArrayList<>();
        while(!qu.isEmpty()){
            node = qu.poll();
            temp.add(node.val);
            if(node.left!=null){
                    qu.add(node.left);
                    nlast=node.left;
                }
            if(node.right!=null){
                qu.add(node.right);
                nlast=node.right;
            }
            if(node==last){
                res.add(temp);
                last=nlast;
                temp = new ArrayList<>();
            }
            
            
        }
        return res;
        
    }
}