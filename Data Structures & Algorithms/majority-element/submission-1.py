class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums = sorted(nums)
        halfSize = len(nums)//2

        for i,j in enumerate(nums):
            if  nums[i] == nums[i + math.ceil(halfSize)]:
                return j


        