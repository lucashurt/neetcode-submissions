class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length();
        StringBuilder res = new StringBuilder();
        int max = Math.max(l1,l2);
        for(int i=0;i<max;i++){
            if(l1>i){
                res.append(word1.charAt(i));
            }
            if(l2>i){
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}