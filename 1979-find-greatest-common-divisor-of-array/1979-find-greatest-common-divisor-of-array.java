class Solution {
    static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y, x%y);
    }
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=nums[0], min=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
       return gcd(max,min);
    }
}