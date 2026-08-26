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
    int pre_index = 0;
    Map<Integer,Integer> inorderMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return dfs(preorder,0,preorder.length-1);
    }
    private TreeNode dfs(int[]preorder,int l, int r){
        if(l>r) return null;
        int rootVal = preorder[pre_index++];
        TreeNode node = new TreeNode(rootVal);
        int mid = inorderMap.get(rootVal);
        node.left = dfs(preorder,l,mid-1);
        node.right = dfs(preorder,mid+1,r);
        return node;
    }
}
