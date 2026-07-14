# Last updated: 7/14/2026, 2:01:03 PM
class Solution:
    def minMoves(self, nums):
        return sum(nums) - len(nums) * min(nums)