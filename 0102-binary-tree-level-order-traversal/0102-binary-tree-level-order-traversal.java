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
    public List<List<Integer>> levelOrder(TreeNode A) {
         List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(A!=null)
        {
            q.add(A);
            q.add(null);
        }
        ArrayList<Integer> levelList = new ArrayList<>();
        while(q.size()>0)
        {
            TreeNode node = q.poll();

            if(node==null)
            {
                result.add(levelList);
                levelList = new ArrayList<>();
                if(q.size()>0)
                    {q.add(null);}
            }
            else{
                levelList.add(node.val);
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