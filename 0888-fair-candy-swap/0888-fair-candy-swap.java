class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int n= aliceSizes.length;
        int m= bobSizes.length;
        int sum1=0, sum2=0;
        for(int i=0;i<n;i++){
            sum1+=aliceSizes[i];
        }
        for(int i=0;i<m;i++){
            sum2+=bobSizes[i];
        }
        int d=(sum1-sum2)/2;
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int[] ans= new int[2];
        int i=0, j=0,k=0;
        while(i<n && j<m){
            int diff= aliceSizes[i]-bobSizes[j];
            if(diff<d){
                i++;
            }
            else if(diff>d){
                j++;
            }
            else {
                ans[0]=aliceSizes[i];
                ans[1]=bobSizes[j];
                break;
            }
        }
        return ans;
    }
}