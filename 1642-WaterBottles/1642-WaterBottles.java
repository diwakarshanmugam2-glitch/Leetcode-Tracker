// Last updated: 7/14/2026, 2:00:38 PM
import java.util.*;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            totalDrank += newBottles;
            empty = empty % numExchange + newBottles;
        }

        return totalDrank;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.numWaterBottles(numBottles, numExchange);
        System.out.println(result);
    }
}
