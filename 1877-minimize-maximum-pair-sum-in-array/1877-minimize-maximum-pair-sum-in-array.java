class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0, max=0;
        int i=0, j=n-1;
        while(i<j){
          sum=nums[i]+nums[j];
          max= Math.max(max, sum);
          i++;
          j--;
        }
        return max;
    }
}