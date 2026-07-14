# Last updated: 7/14/2026, 2:01:30 PM
class Solution(object):
    def isAnagram(self, s, t):
       return sorted(s) == sorted(t)