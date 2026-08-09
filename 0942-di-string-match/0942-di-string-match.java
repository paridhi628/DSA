class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] ans= new int[n+1];
        int i=0, j= ans.length-1;
        int k=0;
        for(int p=0;p<n;p++){
            if(s.charAt(p)=='I'){
                ans[k++]= i;
                i++;
            }
            else if(s.charAt(p)=='D'){
                ans[k++]=j;
                j--;
            }
        }
        ans[k]=i;
        return ans;
    }
}