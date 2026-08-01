class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int lb = 0;
        int ub = nums.length - 1;

        // Find first position
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                ub = mid - 1;
            } else if (nums[mid] < target) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        lb = 0;
        ub = nums.length - 1;

        // Find last position
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                lb = mid + 1;
            } else if (nums[mid] < target) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        return ans;
    }
}
