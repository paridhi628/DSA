class Solution {
    public int maxProduct(int n) {

        int temp = n;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        int max = 0;

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                int p = digits[i] * digits[j];
                max = Math.max(max, p);
            }
        }

        return max;
    }
}