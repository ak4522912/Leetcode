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
    static int preIdx = 1;
    static HashMap<Integer,Integer> inIdx = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++)
        {
            inIdx.put(inorder[i],i);
        }
         preIdx = 1;
        TreeNode root = new TreeNode(preorder[0]);
        int elemIdx =inIdx.get(preorder[0]);
        root.left = build(preorder,0,elemIdx-1);
        root.right = build(preorder,elemIdx+1,preorder.length-1);
        return root;
    }
    public static TreeNode build(int[] preorder,int start,int end)
    {
          
        if(start>end)
            return null;
        
        TreeNode root = new TreeNode(preorder[preIdx++]);
        
        if(start==end)
            return root;
        
        int elemIdx =inIdx.get(preorder[preIdx-1]);
        root.left = build(preorder,start,elemIdx-1);
        root.right = build(preorder,elemIdx+1,end);
        return root;
    }
}