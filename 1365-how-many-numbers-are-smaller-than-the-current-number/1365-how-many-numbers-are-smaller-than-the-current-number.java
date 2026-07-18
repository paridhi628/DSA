class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
          int n=nums.length;
          int[] ans=new int[n];
          int i=0, c=0, k=0;
          while(i<n){
          for(int j=0;j<n;j++){
             if(nums[i]>nums[j]){
                c++;
             }
          }
              ans[k]=c;
                c=0;
                i++;
               k++; 
          } 
           return ans;
    }
}