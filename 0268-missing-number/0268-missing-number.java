class Solution {
    public int missingNumber(int[] nums) {
      //  int n=nums.length;
        // int sum1=0, sum2=0;
        // for(int i=0;i<n;i++){
        //     sum1=sum1+nums[i];
        // }
        // for(int i=1;i<=n;i++){
        //     sum2=sum2+i;
        // }
        // return sum2-sum1;
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++)
            xor ^= i ^ nums[i];

        return xor;
    }
}