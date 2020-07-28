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
    int pre_ix = 0;
    Map<Integer, Integer> map = new HashMap<>();
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pre_ix = inorder.length-1;
        
        generateMap(inorder);
        
        return build(inorder, 0, inorder.length-1, postorder); 
    }
    
    private void generateMap(int[] inorder){
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
    }
    
    private TreeNode build(int[] inorder, int in_start, int in_end, int[] postorder){
        if(pre_ix < 0 || in_start < 0 || in_start > in_end)
            return null;
        
        TreeNode root = new TreeNode(postorder[pre_ix--]);
        
        int root_ix = map.get(root.val);
        
        root.right = build(inorder, root_ix+1, in_end, postorder);
        root.left = build(inorder, in_start, root_ix-1, postorder);
        
        return root;
    }
}
