// Last updated: 7/14/2026, 2:02:39 PM
import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            int idx = k / fact[i - 1];  
            sb.append(numbers.get(idx)); 
            numbers.remove(idx);         
            k %= fact[i - 1];           
        }

        return sb.toString();
    }
}
