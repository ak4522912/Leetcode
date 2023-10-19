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
    public List<Integer> rightSideView(TreeNode A) {
        List<Integer> result = new ArrayList<>();
        if(A==null) return result;
        Queue<TreeNode>q = new LinkedList<>();
    
            q.add(A);
            q.add(null);
        int prev=0;
        while(q.size()>1)
        {
           TreeNode node =  q.poll();
           
           if(node==null)
           {
               q.add(null);
               result.add(prev);
            //   System.out.println(prev+"null");
           }
           else{
               
               prev = node.val;
            //   System.out.println(prev);
           if(node.left!=null)
           {
               q.add(node.left);
           }
           if(node.right!=null)
           {
               q.add(node.right);
           }
           
           }
        }
        result.add(prev);
        return result;
    }
}