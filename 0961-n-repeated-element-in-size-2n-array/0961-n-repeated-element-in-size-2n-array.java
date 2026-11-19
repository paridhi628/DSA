class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int i=0, j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                return nums[i];
            }
            i++;
            j++;
        }
        return -1;
    }
}