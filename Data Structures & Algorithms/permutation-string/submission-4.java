class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1count = new int[26];
        int[] s2count = new int[26];
        int matches = 0;
        
        if(s2.length()<s1.length()) return false;
        
        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(s1count[i] == s2count[i]) matches++;
        }

        int l=0;
        for(int r=s1.length();r<s2.length();r++){
            if(matches == 26){
                return true;
            }

            int indexIn = s2.charAt(r) - 'a';
            s2count[indexIn]++;
            if(s2count[indexIn] == s1count[indexIn]){
                matches++;
            }
            else if(s1count[indexIn] + 1 == s2count[indexIn]){
                matches--;
            }

            int indexOut = s2.charAt(l) - 'a';
            s2count[indexOut]--;
            if(s2count[indexOut] == s1count[indexOut]){
                matches++;
            }
            else if(s1count[indexOut] - 1 == s2count[indexOut]){
                matches--;
            }
            l++;
        }
        return matches == 26;
    }
}
