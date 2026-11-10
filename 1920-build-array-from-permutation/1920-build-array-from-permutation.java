class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int k=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[k++]=nums[nums[i]];
        }
        return ans;
    }
    }