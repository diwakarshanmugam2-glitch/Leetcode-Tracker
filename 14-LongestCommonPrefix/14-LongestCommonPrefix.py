# Last updated: 7/14/2026, 2:03:40 PM
class Solution:
    def longestCommonPrefix(self, strs):

        prefix = strs[0]

        for word in strs[1:]:

            while not word.startswith(prefix):

                prefix = prefix[:-1]

                if prefix == "":
                    return ""

        return prefix
        