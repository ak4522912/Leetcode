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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inOrderIndex  = new HashMap<Integer,Integer>();
        for(int i = 0;i<inorder.length;++i)
        {
            inOrderIndex.put(inorder[i],i);
        }
        return buildTree(preorder,inorder,inOrderIndex,0,preorder.length-1,0,inorder.length-1);
    }
    TreeNode buildTree(int[] A, int[] B,HashMap<Integer,Integer> inOrderIndex, int preStart, int preEnd, int inStart,int inEnd)
    {
        if(inStart>inEnd)  return null;
        TreeNode node = new TreeNode(A[preStart]);
        int inIndex = inOrderIndex.get(node.val);
        int numsLeft = inIndex - inStart;
        node.left = buildTree(A,B,inOrderIndex,preStart+1,preStart+numsLeft,inStart,inIndex - 1);
        node.right = buildTree(A,B,inOrderIndex,preStart+numsLeft+1,preEnd,inIndex+1,inEnd);
        return node;
    }
}