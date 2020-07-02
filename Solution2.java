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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        
        if(root == null)
            return traversal;
        
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack();
        
        queue.add(root);
        
        while(queue.size() != 0){
            int q_size = queue.size();
            
            List<Integer> level = new ArrayList<>();
            
            while(q_size > 0){
                TreeNode node = queue.poll();
                
                level.add(node.val);

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
                
                q_size--;
            }
            
            stack.add(level);
        }
        
        while(!stack.isEmpty())
            traversal.add(stack.pop());
        
        return traversal;
    }
}
