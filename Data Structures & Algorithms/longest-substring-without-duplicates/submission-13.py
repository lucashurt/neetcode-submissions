class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        letters = set()
        res = 0
        l = 0
        for r in range(0,len(s)):
            if(s[r] not in letters):
                letters.add(s[r])
                res = max(res,r-l + 1)
                continue
            while s[r] in letters:
                letters.discard(s[l])
                l += 1
                
            letters.add(s[r])
        return res

        