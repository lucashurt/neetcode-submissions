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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        return res.get(k-1);
    }
    public void dfs(TreeNode node, List<Integer> res){
        if(node == null) return;
        dfs(node.left,res);
        res.add(node.val);
        dfs(node.right,res);
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
