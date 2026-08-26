class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0, l = 0, r = 0;
        Set<Character> set = new HashSet<>();
        while(r<s.length()){
            char newChar = s.charAt(r);
            if(!set.add(newChar)){
                while(set.contains(newChar)){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(newChar);
            res = Math.max(res,r-l + 1);
            r++;
        }
        return res;
    }
}
