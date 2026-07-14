// Last updated: 7/14/2026, 2:03:06 PM
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remain, int start, List<Integer> path, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(path)); 
            return;
        } else if (remain < 0) {
            return; 
        }

        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]); 
            backtrack(candidates, remain - candidates[i], i, path, result); 
            path.remove(path.size() - 1); 
        }
    }
}
