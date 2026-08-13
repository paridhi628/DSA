class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int i=0, j=n-1;
        long c=0;
        while(i<j){
            c+=Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[j]));
            i++;
            j--;
        }
        if(i==j){
            c+=nums[i];
        }
        return c;
    }
}