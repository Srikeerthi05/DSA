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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

        private int maxPath(TreeNode node){
            if(node==null){
                return 0;
            }
            int left=maxPath(node.left);
            int right=maxPath(node.right);


            int onlyNode=node.val;
            int nodeandleft=node.val+left;
            int nodeandright=node.val+right;
            int nodeboth=left+node.val+right;
        
         
        maxSum=Math.max(maxSum,
        Math.max(
            Math.max(onlyNode,nodeandleft),
            Math.max(nodeandright,nodeboth)
        )
        );

        return Math.max(onlyNode,Math.max(nodeandleft,nodeandright));
    }
}
