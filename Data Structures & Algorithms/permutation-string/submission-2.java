class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int matches = 0;

        if(s2.length()<s1.length()) return false;
        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        for(int i = 0;i<26;i++){
            if(s1Count[i] == s2Count[i]) matches++;
        }
        int l = 0;

        for(int r = s1.length();r<s2.length();r++){
            if(matches == 26){
                return true;
            }
            int indexIn = s2.charAt(r) - 'a';
            int indexOut = s2.charAt(l) - 'a';
        
            s2Count[indexIn]++;
            if(s2Count[indexIn] == s1Count[indexIn]){
                matches++;
            }
            else if (s1Count[indexIn] + 1 == s2Count[indexIn]) {
                matches--;
            }

            s2Count[indexOut]--;
            if(s2Count[indexOut] == s1Count[indexOut]){
                matches++;
            }
            else if( s1Count[indexOut]-1 == s2Count[indexOut]){
                matches--;
            }
            l++;
        }
        System.out.println(matches);
        return matches == 26;
    }
}
