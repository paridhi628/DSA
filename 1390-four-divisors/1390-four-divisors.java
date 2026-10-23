class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        int ans = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int c = 0;
            for(int j=1; j<=nums[i]; j++){
                if(nums[i] % j == 0){
                    sum += j;
                    c++;
                }
                if(c > 4) break;
            }
            if(c == 4){
                ans += sum;
            } 
            sum = 0;
        }
        return ans;
    }
}