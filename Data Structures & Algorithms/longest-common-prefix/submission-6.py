class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        prefixEnded = False
        for i,j in enumerate(strs[0]):
            for string in strs:
                if i >= len(string) or string[i] != strs[0][i]:
                    prefixEnded = True
            if prefixEnded:
                break
            res += strs[0][i]
        return res

        