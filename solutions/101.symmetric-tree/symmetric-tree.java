/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//第一次没看答案写出来，异常开心啊，哈哈哈哈，而且还是我最不会写的递归程序
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return isSymTree(root.left,root.right);
    }
    public boolean isSymTree(TreeNode left,TreeNode right){
      
        if(left==null&&right==null)return true;
        if(left!=null&&right==null)return false;
        if(left==null&&right!=null)return false;
        if(left.val!=right.val)return false;
        return isSymTree(left.right,right.left)&&isSymTree(right.right,left.left);
      } 
}
//迭代法
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//      Queue<TreeNode> q = new LinkedList<>();
//         if(root==null)return true;
//         q.add(root);
//         q.add(root);
//             while(!q.isEmpty()){
//                 TreeNode n1=q.poll();
//                 TreeNode n2=q.poll();
//                 if(n1==null&&n2==null)continue;
//                 if(n1==null||n2==null)return false;
//                 if(n1.val!=n2.val)return false;
//                 q.add(n1.left);
//                 q.add(n2.right);
//                 q.add(n1.right);
//                 q.add(n2.left);
                
//             }
//         return true;
        
        
        
//       } 
// }