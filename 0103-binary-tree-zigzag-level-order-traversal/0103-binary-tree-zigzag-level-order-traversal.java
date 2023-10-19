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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode A) {
        Queue<TreeNode>q = new LinkedList<>();
       if(A!=null)
       {
           q.add(A);
           q.add(null);
       }
       ArrayList<Integer> list = new ArrayList<>();
       boolean direction = true;
       while(q.size()>0)
       {
         TreeNode node  = q.poll();
         if(node==null)
         {
             if(q.size()>0)
                { q.add(null);}
             direction = !direction;
             if(direction)
             {
                 Collections.reverse(list);
             }
             result.add(list);
             list=new ArrayList<>();
         }
         else{
         list.add(node.val);
        //  if(direction)
        //  {
        //     if(node.right!=null)
        //      {
        //          q.add(node.right);
        //      }
        //      if(node.left!=null)
        //      {
        //          q.add(node.left);
        //      }
        //  }

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
       return result;
    }
}