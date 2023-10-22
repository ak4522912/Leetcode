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
    public TreeNode sortedArrayToBST(int[] A) {
        int mid = (0 + A.length-1)/2;
        return construct(A,0,A.length-1);
    }
    
    TreeNode construct(final int[] A,int start,int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = construct(A,start,mid-1);
        root.right = construct(A,mid+1,end);
        return root;
    }
}