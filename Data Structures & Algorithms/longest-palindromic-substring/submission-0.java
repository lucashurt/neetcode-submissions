class Solution {
    public String longestPalindrome(String s) {
        int res = 0, index = 0;

        for(int i=0;i<s.length();i++){
            int l = i,r = i;
            while(r<s.length() && l>=0 && s.charAt(l) == s.charAt(r)){
                if(res < r-l+1){
                    res = r-l+1;
                    index = l;
                }
                l--;
                r++;
            }
        }
        for(int i=0;i<s.length();i++){
            int l = i,r = i+1;
            while(r<s.length() && l>=0 && s.charAt(l) == s.charAt(r)){
                if(res < r-l+1){
                    res = r-l+1;
                    index = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(index,index+res);
    }
}
