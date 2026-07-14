# Last updated: 7/14/2026, 2:01:42 PM
class Solution(object):
    def findKthLargest(self, nums, k):
        nums.sort()
        return nums[-k]