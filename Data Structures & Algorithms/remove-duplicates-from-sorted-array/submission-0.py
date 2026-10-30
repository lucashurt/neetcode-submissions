class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l,r = 0,0
        length = len(nums)

        while r < length:
            nums[l] = nums[r]
            while(r<length and nums[r] == nums[l]):
                r += 1
            l += 1
        return l
            



        