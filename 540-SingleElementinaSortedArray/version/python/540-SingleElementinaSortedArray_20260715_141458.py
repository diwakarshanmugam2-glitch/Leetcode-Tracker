# Last updated: 7/15/2026, 2:14:58 PM
1class Solution(object):
2    def singleNonDuplicate(self, nums):
3        return sum(set(nums))*2-sum(nums)
4        