// Last updated: 7/14/2026, 2:01:46 PM
import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1; 
    }
}
