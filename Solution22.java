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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        
        if(root == null)
            return traversal;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        int level_num = 0;
        
        queue.add(root);
        
        while(queue.size() != 0){
            int q_size = queue.size();
            
            List<Integer> level = new ArrayList<>();
            
            while(q_size > 0){
                TreeNode node = queue.poll();
                
                if(level_num%2 == 0)
                    level.add(node.val);
                else
                    level.add(0,node.val);

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
                
                q_size--;
            }
            
            traversal.add(level);
            level_num++;
            
        }
        
        return traversal;
    }
}
