class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=0, m=0,c=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                c=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==max && c!=i|| nums[i]<max && nums[i]>m && c!=i){
                m=nums[i];
            }
        }
        return (m-1)*(max-1);
    }
}