class Solution {
    public int search(int[] nums, int target) {
        int ub=nums.length-1,lb=0;
        while(lb<=ub){
            int mid=lb + (ub-lb)/2;
             if(target==nums[mid]){
                return mid;
                }
           if (nums[lb] <= nums[mid]) {
                if (target >= nums[lb] && target < nums[mid]) {
                    ub = mid - 1;
                } else {
                    lb = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[ub]) {
                    lb = mid + 1;
                } else {
                    ub = mid - 1;
                }
            }
        }
        return -1;
    }
}