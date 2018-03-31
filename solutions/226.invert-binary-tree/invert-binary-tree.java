/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//比标准答案少用了一点内存，自己想出来的，棒棒！！！
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//        if(root==null)
//            return null;
//         TreeNode temp = root.right;
//         root.right=invertTree(root.left);
//         root.left=invertTree(temp);
//         return root;
       
        
//     }
// }
class Solution {
    public TreeNode invertTree(TreeNode root) {
       if(root==null)
           return null;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            
        }
        return root;
    }
}
