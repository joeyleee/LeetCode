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
//     private int sum=0;
//     public TreeNode convertBST(TreeNode root) {
//         if(root==null){
//             return root;
//         }
//         convertBST(root.right);
//         sum+=root.val;
//         root.val=sum;
//         convertBST(root.left);
//         return root;
//        }
// }
class Solution {
    private int sum=0;
    public TreeNode convertBST(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
         TreeNode node=root;
        if(root==null){
            return root;
        }
        while(node!=null||!s.isEmpty()){
        while(node!=null){
            s.add(node);
            node=node.right;
            
        }
        if(!s.isEmpty()){
            node=s.pop();
            sum+=node.val;
            node.val=sum;
            node=node.left;
            
        }
        }
        return root;
        
       }
}