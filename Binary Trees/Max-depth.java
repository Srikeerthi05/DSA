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
    public int maxDepth(TreeNode root) {
         if(root==null){
            return 0;
         }
         int l=maxDepth(root.left);
         int r=maxDepth(root.right);

         return 1+Math.max(l,r);
        
    }
}






// optimal
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
    public int maxDepth(TreeNode root) {
         if(root==null){
            return 0;
         }
        //  int l=maxDepth(root.left);
        //  int r=maxDepth(root.right);

        //  return 1+Math.max(l,r);

    Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);
    int depth=0;


    while(!q.isEmpty()){
        int lsize=q.size();
        for(int i=0;i<lsize;i++){
            TreeNode curr=q.poll();

            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
        depth++;
    }

    return depth;
        
    }
}
