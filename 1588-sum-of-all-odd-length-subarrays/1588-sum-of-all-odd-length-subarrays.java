class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int t = (i + 1) * (n - i);
            int odd = (t + 1) / 2;
            sum += arr[i] * odd;
        }
        return sum;
    }
}