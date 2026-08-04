class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=0, min=nums[0];
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int t=max-min+1;
        int[] arr= new int[t];
        int k=0;
        for(int i=min;i<=max;i++){
            arr[k++]=i;
        }
        int i=0, j=0;
        while(i<n && j<t){
            if (nums[i] == arr[j]) {
          i++;
          j++;
           }
          else if (nums[i] > arr[j]) {
            ans.add(arr[j]);
              j++;
        }
          else {
             i++;
            }
        }
        return ans;
    } 
}