class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        map = {}
        for i,j in enumerate(nums):
            if j in map and i - map[j] <= k:
                return True
            map[j] = i
        return False

