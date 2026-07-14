// Last updated: 7/14/2026, 2:01:02 PM
import java.util.*;

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                int other = num / i;
                if (other != i) {
                    sum += other;
                }
            }
        }

        return sum == num;
    }

    // Main method is optional for GFG, but useful for local testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Solution obj = new Solution();
        boolean result = obj.checkPerfectNumber(num);
        System.out.println(result);
    }
}
