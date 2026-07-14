# Last updated: 7/14/2026, 2:04:02 PM
class Solution:
    def lengthOfLongestSubstring(self, s):
        ans = 0
        for i in range(len(s)):
            cur = ""
            for ch in s[i:]:
                if ch in cur:
                    break
                cur += ch
                ans = max(ans, len(cur))
        return ans