class Solution {
    int sum(int n){
        int c=0;
        while(n>0){
            int rem=n%10;
            c++;
            n=n/10;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
          int s=sum(nums[i]);
          if(s%2==0){
           c++;
          }
        }
        return c;
    }
}