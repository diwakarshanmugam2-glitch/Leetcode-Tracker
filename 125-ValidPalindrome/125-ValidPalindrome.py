# Last updated: 7/14/2026, 2:02:00 PM
class Solution(object):
    def isPalindrome(self, s):
      cleaned=""
      for ch in s:
        if ch.isalnum():
         cleaned+=ch.lower()
      return cleaned == cleaned[::-1]
        