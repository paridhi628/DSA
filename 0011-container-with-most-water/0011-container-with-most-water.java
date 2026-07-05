class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0, j=n-1;
        int max=0;
        while(i<j){
            int area= (j-i) * Math.min(height[i], height[j]);
            max=Math.max(area, max);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}