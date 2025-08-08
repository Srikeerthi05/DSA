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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> h=new HashSet<>();
        return find(root,k,h);
    }

        boolean find(TreeNode root, int k, HashSet h){
            if(root==null){
                return false;
            }
            if(h.contains(k-root.val)){
                return true;
            }
            else if(!h.contains(root.val)){
                 h.add(root.val);
            }
            
            return find(root.left ,k,h)||(find(root.right,k,h));
            
            
        }
        
    
}
