class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        //int[] ans= new int[n];
        List<Integer> ans= new ArrayList<>();
        int i=0, j=1, k=0;
        while(i<n && j<n){
            if(nums[i]==nums[j]){
                ans.add(nums[i]);
            }
            i++;
            j++;
        }
        return ans;
    }
}