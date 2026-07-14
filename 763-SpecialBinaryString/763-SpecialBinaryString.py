# Last updated: 7/14/2026, 2:00:51 PM
class Solution:
    def makeLargestSpecial(self, s):
        res = []
        count = start = 0

        for i, ch in enumerate(s):
            if ch == '1':
                count += 1
            else:
                count -= 1

            if count == 0:
                res.append("1" + self.makeLargestSpecial(s[start + 1:i]) + "0")
                start = i + 1

        res.sort(reverse=True)
        return "".join(res) if res else s
        