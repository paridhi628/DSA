class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int[] ans=new int[n];
        if(n==1) return true;
        int k=0;
        int i=1;
        while(i<n){
          ans[k++]=nums1[i]-nums1[i-1];
          if(ans[k-1]%2==0 && nums1[i]%2==0 || ans[k-1]%2!=0 && nums1[i]%2!=0){
            return true;
          }
          i++;
        }
        return true;
    }
}