class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int k=0;
        int[] ans= new int[n];
        for(int i=0;i<n && k<n;i++){
            if(arr[i]!=0){
                ans[k++]= arr[i];
            }
            else {
                ans[k++]=arr[i];
               if(k<n){
                ans[k++]=arr[i];
               }
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}