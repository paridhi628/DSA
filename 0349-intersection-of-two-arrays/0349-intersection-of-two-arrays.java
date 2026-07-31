class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
         Arrays.sort(nums1);
         Arrays.sort(nums2);
        int k=0;
        int ans[]= new int[Math.min(m,n)];
        int l=0, u=0;
        while(l<m && u<n){
                if(nums1[l]==nums2[u]){
                   if(k==0 || ans[k-1]!=nums1[l]){
                    ans[k++]=nums1[l];
                   }
                l++;
                u++;}
               else if (nums1[l] < nums2[u]) {
                   l++;
                     }
                 else {
                     u++;
                   }
                 
                 }
       return Arrays.copyOf(ans, k);
    }
}