# Last updated: 7/15/2026, 2:16:40 PM
1class Solution(object):
2    def findKthLargest(self, nums, k):
3        nums.sort()
4        return nums[-k]