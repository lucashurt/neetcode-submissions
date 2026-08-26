class Solution {
    private List<String> res = new ArrayList<>();
    private String[] digitToChar = {
            "", "", "abc", "def", "ghi", "jkl", 
            "mno", "qprs", "tuv", "wxyz"
    };
    

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        dfs(digits,"",0);
        return res;

    }
    public void dfs(String digits, String curString, int i){
        if(curString.length()>=digits.length()){
            res.add(curString);
            return;
        }
        String characters = digitToChar[digits.charAt(i) - '0'];
        for(char character:characters.toCharArray()){
           dfs(digits,curString + character,i+1);
        }
    }
}

