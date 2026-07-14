# Last updated: 7/14/2026, 2:03:17 PM
class Solution:
    def removeElement(self, nums, val):

        k = 0

        for i in range(len(nums)):

            if nums[i] != val:
                nums[k] = nums[i]
                k += 1

        return k    