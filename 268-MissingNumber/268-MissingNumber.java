// Last updated: 7/14/2026, 2:01:25 PM
class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=nums.length;i++){
            map.put(i,1);
        }
        for(int i : nums){
            map.remove(i);
        }
        for(int i : map.keySet())
            return i;
        return -1;
    }
}