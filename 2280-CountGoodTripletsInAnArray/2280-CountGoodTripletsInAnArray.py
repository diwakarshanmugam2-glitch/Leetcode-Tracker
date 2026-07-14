# Last updated: 7/14/2026, 2:00:43 PM
class Solution:
    def goodTriplets(self, nums1, nums2):
        n = len(nums1)

        pos = [0] * n
        for i, x in enumerate(nums2):
            pos[x] = i

        arr = [pos[x] for x in nums1]

        bit = [0] * (n + 1)

        def update(i, val):
            i += 1
            while i <= n:
                bit[i] += val
                i += i & -i

        def query(i):
            s = 0
            i += 1
            while i > 0:
                s += bit[i]
                i -= i & -i
            return s

        left = [0] * n

        for i in range(n):
            left[i] = query(arr[i] - 1)
            update(arr[i], 1)

        bit = [0] * (n + 1)

        right = [0] * n

        for i in range(n - 1, -1, -1):
            right[i] = query(n - 1) - query(arr[i])
            update(arr[i], 1)

        ans = 0

        for i in range(n):
            ans += left[i] * right[i]

        return ans