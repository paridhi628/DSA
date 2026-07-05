class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int c=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]= heights[i];
        }
        Arrays.sort(ans);
        int i=0, j=0;
        while(i<n && j<n){
            if(heights[i]!=ans[i]){
                c++;
            }
            i++;
            j++;
        }
        return c;
    }
}