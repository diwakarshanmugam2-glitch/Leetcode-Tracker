// Last updated: 7/14/2026, 2:01:08 PM
import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num); 
            } else {
                seen.add(num); 
            }
        }

        return duplicates;
    }
}
