class Solution {
    public int[] shuffle(int[] nums, int n) {
        int t=nums.length;
        int[] ans=new int[t];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k]=nums[i];
            k=k+2;
        }
        int l=1;
        for(int i=n;i<t;i++){
            ans[l]=nums[i];
            l=l+2;
        }
        return ans;
    }
}