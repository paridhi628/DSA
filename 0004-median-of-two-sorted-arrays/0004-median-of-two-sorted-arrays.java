class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] ans= new int[m+n];
        int i=0, j=0, k=0;
        double median=0.0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                ans[k++]=nums2[j];
                j++;
            }
            else{
                ans[k++]= nums1[i];
                i++;
            }
        }
        while(i<m){
            ans[k++]=nums1[i];
            i++;
        }
        while(j<n){
            ans[k++]= nums2[j];
            j++;
        }
        int p=ans.length;
        int st=0, end=p-1;
        if(p%2!=0){
            int mid= st+(end-st)/2;
            median=ans[mid];
        }
        else{
            int t=st+(end-st)/2;
              median=(ans[t]+ans[t+1])/2.0;
        }
        return median;
    }
}