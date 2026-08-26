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
    TreeNode result = null;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return result.val;
    }
    public void inorder(TreeNode node, int k){
        if(node == null) return;
        inorder(node.left,k);
        visited++;
        if(visited == k){
            result = node;
        }
        inorder(node.right,k);

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
