class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
       int n=nums.length;
       int p=1;
       for(int i=0;i<n;i++){
         if(nums[i]==p*k){
            p=p+1;;
         }
       }
       return p*k;
    }
}