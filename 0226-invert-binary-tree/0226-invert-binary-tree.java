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
    public TreeNode invertTree(TreeNode root) {
         return invert(root);
    }
    TreeNode invert(TreeNode root)
    {
       if(root==null)
       {
           return root;
       }
    //   if(root.left==null&root.right==null)
    //   {
    //       return root;
    //   }
       
    //   if(root.left==null)
    //   {    invert(root.right);
    //       root.left = root.right;
    //       root.right = null;
    //   }
    //   else if(root.right==null){
    //       invert(root.left);
    //       root.right = root.left;
    //   }
    //   else{
           invert(root.right);
           invert(root.left);
           TreeNode temp = root.left;
           root.left = root.right;
           root.right = temp;
    // }
        
       return root;
    }
}