class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        helper(word,res, 0, 0, n);
        return res;

    }
    public void helper(StringBuilder word, List<String> res, int open, int closed,int n){
        if(closed == n && open == n){
            res.add(word.toString());
            return;
        }

        if(open < n){
            word.append('(');
            helper(word,res,open+1,closed,n);
            word.deleteCharAt(word.length()-1);
        }
        
        if(closed < open){
            word.append(')');
            helper(word,res,open,closed+1,n);
            word.deleteCharAt(word.length()-1);
        }
    }
}
