class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        size = len(nums)
        res = [0] * (size*2)
        for i,j in enumerate(nums):
            res[i] = j
            res[size + i] = j
        return res
        