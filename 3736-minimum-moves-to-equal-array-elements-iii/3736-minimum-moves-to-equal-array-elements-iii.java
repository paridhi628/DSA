class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int c=0,max=0;
        for(int i=0;i<n;i++){
             max=Math.max(max,nums[i]);
        }
        for(int i=0;i<n;i++){
            c+=max-nums[i];
        }
        return c;
    }
}