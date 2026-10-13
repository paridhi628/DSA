
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long total = 0;
        int k = n / 2;

        for (int i = 0; i < k; i++) {
            total -= squares[i];
        }

        for (int i = k; i < n; i++) {
            total += squares[i];
        }

        return total;
    }
}
