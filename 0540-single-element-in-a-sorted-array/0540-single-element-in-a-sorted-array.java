class Solution {
    public int singleNonDuplicate(int[] nums) {

        int st = 0;
        int end = nums.length - 1;

        while (st < end) {

            int mid = st + (end - st) / 2;

            if (mid % 2 == 0) { 

                if (nums[mid] == nums[mid + 1]) {
                    st = mid + 2;
                } else {
                    end = mid;
                }

            } else { 

                if (nums[mid] == nums[mid - 1]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }

        return nums[st];
    }
}