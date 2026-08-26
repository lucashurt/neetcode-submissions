class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtracking(0,0,n,res,stack);
        return res;
        }
    public void backtracking(int open, int close, int n, List<String > res, StringBuilder stack){
        if(open == close && open == n){
            res.add(stack.toString());
            return;
        }
        if(open<n){
            stack.append('(');
            backtracking(open+1,close,n,res,stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if(close<open){
            stack.append(')');
            backtracking(open,close+1,n,res,stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
