# Last updated: 7/14/2026, 2:03:04 PM
class Solution:
    def combinationSum2(self, candidates, target):
        candidates.sort()
        res = []

        def backtrack(start, path, target):
            if target == 0:
                res.append(path)
                return

            for i in range(start, len(candidates)):
                if i > start and candidates[i] == candidates[i - 1]:
                    continue

                if candidates[i] > target:
                    break

                backtrack(
                    i + 1,
                    path + [candidates[i]],
                    target - candidates[i]
                )

        backtrack(0, [], target)
        return res