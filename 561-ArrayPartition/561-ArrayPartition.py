# Last updated: 7/14/2026, 2:01:00 PM
class Solution:
    def arrayPairSum(self, nums):
        nums.sort()

        total = 0

        for i in range(0, len(nums), 2):
            total += nums[i]

        return total