class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        for l in range(len(nums)):
            for r in range (l + 1, l+1+k):
                if(r < len(nums) and nums[l] == nums[r]):
                    return True
                
        return False
        