# Last updated: 7/14/2026, 2:00:59 PM
class Solution:
    def arrayNesting(self, nums):
        ans = 0

        for i in range(len(nums)):
            count = 0
            curr = i

            while nums[curr] != -1:
                nxt = nums[curr]
                nums[curr] = -1
                curr = nxt
                count += 1

            ans = max(ans, count)

        return ans