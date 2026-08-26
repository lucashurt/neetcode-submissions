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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int lastVal = -1;
            int qLen = q.size();
            for(int i=0; i<qLen;i++){
                TreeNode cur = q.poll();
                if(cur!=null){
                    lastVal = cur.val;
                    q.offer(cur.left);
                    q.offer(cur.right);
                }
            }
            if(lastVal >=0 ){
                res.add(lastVal);
            }
        }
        return res;
    }
}
//lv = 1
// q = {}
//        1
//     2     3
//   4  5   6
//  7  8 9
// 
// 
// 
// 
// 
// 
// 
