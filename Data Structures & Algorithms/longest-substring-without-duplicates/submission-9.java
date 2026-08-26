class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0;
        Map<Character,Integer> count = new HashMap<>();

        for(int r=0;r<s.length();r++){
            if(count.containsKey(s.charAt(r))){
                l= Math.max(l,count.get(s.charAt(r))+1);
            }
            count.put(s.charAt(r),r);
            res = Math.max(res,r-l + 1);
        }
        return res;
    }
}
