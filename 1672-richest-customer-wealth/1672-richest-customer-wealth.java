class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int[] ans=new int[100];
        int k=0, max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
          sum+= accounts[i][j];
        }
        ans[k++]=sum;
        sum=0;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
}