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
    public List<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        return preorderTraversal(A,result);
    }
    public ArrayList<Integer> preorderTraversal(TreeNode A,ArrayList<Integer> result)
    {
        if(A ==null) return result;
        result.add(A.val);
        preorderTraversal(A.left,result);
        preorderTraversal(A.right,result);
        return result;
    }
}