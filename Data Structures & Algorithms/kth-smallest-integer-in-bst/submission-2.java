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
    int visited = 0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode res = inorder(root,k);
        return res.val;
    }
    public TreeNode inorder(TreeNode node, int k){
        if(node == null) return null;
        TreeNode left = inorder(node.left,k);
        if(left!=null){
            return left;
        }
        visited++;
        if(visited == k){
            return node;
        }
        return(inorder(node.right,k));

    }
}
//              8
//         4         12
//      2     6   10    14
//    1  3  5 7  9 11 13 15
// 
// 
// 
// 
// 
// 
// 
// 
// 
