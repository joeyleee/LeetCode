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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Stack<TreeNode> sk = new Stack<>();
        TreeNode t1=s,t2=t;
        while(t1!=null||!sk.isEmpty()){
        while(t1!=null){
            if(t1.val==t2.val){
                if(isSame(t1,t2)==true)return true;
                
            }
            sk.push(t1);
            t1=t1.left;
        }
            t1=sk.pop();
            t1=t1.right;
            
        }
        return false;
        
    }
   
     private boolean isSame(TreeNode n1, TreeNode n2) {
        if (n1 == null || n2 == null) {
            if (n1 == n2) {
                return true;
            } else {
                return false;
            }
        }
        
        if (n1.val != n2.val) {
            return false;
        }
        
        return isSame(n1.left, n2.left) && isSame(n1.right, n2.right);
    }
}
   
