class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        uniqueNums = set()
        res = 0

        for num in nums:
            uniqueNums.add(num)
        
        for num in uniqueNums:
            if num - 1 in uniqueNums:
                continue
            count = 1
            while num + 1 in uniqueNums:
                count += 1
                num += 1
            res = max(count,res)

        return res


        