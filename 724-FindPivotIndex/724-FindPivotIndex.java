// Last updated: 7/14/2026, 2:00:54 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] ps = new int[n]; 
        int[] ss = new int[n];
        ps[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }
        ss[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ss[i] = ss[i + 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : ps[i - 1];
            int rightSum = (i == n - 1) ? 0 : ss[i + 1];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
