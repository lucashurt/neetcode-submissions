class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ltr1,ltr2 = 0,0
        word3 = ""
        while ltr1 < len(word1) and ltr2 < len(word2):
            word3 += word1[ltr1]
            word3 += word2[ltr2]
            ltr1 +=1
            ltr2 +=1
        
        while ltr1 < len(word1):
            word3 += word1[ltr1]
            ltr1 +=1
        
        while ltr2 < len(word2):
            word3 += word2[ltr2]
            ltr2 +=1
        
        return word3


        