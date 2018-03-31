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
//     public int maxDepth(TreeNode root) {
//         if(root==null)
//             return 0;
//         return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        
        
//     }
// }
class Solution{
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        HashMap<TreeNode,Integer> depth =new HashMap<>();
        Stack<TreeNode> node = new Stack<>();
        int max =0;
        node.push(root);
        depth.put(root,1);
        while(!node.isEmpty()){
            root=node.pop();
            int d=depth.get(root);
            max = Math.max(max,d);
            if(root.left!=null){
                node.push(root.left);
                depth.put(root.left,d+1);
                
            }
            if(root.right!=null){
                node.push(root.right);
                depth.put(root.right,d+1);
            }
        }
        return max;
        
        
    }
}