# Last updated: 7/14/2026, 2:03:01 PM
class Solution(object):
    def firstMissingPositive(self, nums):
        s=set(nums)
        i=1
        while i in s:
            i+=1
        return i


        