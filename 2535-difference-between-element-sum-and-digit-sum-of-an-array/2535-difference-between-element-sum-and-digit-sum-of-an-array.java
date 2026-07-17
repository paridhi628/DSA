class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum1=0,i=0,j=0;
        for(i=0;i<n;i++){
            sum1+=nums[i];
        }
        int sum2=0;
        while(j<n){
            while(nums[j]!=0){
            int rem=nums[j]%10;
            sum2+= rem;
           nums[j]=nums[j]/10;
        }
        j++;
        }
        return Math.abs(sum1-sum2);
    }
}