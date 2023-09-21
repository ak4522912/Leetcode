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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         HashMap<Integer,Integer> inOrderIndex = new HashMap<>();
        for(int i = 0; i<inorder.length;++i)
        {
            inOrderIndex.put(inorder[i], i);
        }
        
        return buildTree( inorder, postorder,inOrderIndex,0,inorder.length-1,0,postorder.length -1);
    }
    static TreeNode buildTree( int[] A, int[] B,
    HashMap<Integer,Integer> inOrderIndex,int inStart,
    int inEnd,int postStart,int postEnd )
    {
        if(inStart>inEnd) return null;
        TreeNode root = new TreeNode( B[postEnd] );
        int index = inOrderIndex.get(root.val);
        int numsLeft = index  - inStart;
        root.left = buildTree(A,B,inOrderIndex,inStart,index-1,postStart,postStart + numsLeft - 1);
        root.right = buildTree(A,B,inOrderIndex,index+1,inEnd,postStart+numsLeft,postEnd-1);
        return root;
    }

}