/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
     return check(root,root);
    }
    boolean check(TreeNode left, TreeNode right)
    {
        if(left==null||right==null)
        {
            if(left==right)
            {
                return true;
            }
            else{
                return false;
            }
        }
              if(left.val !=right.val) return false;
        return check(left.right,right.left)&check(left.left,right.right);
        
    }
}