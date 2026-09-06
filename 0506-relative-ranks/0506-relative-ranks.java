class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans=new String[n];
        for(int i=1;i<=n;i++){
           int max=-1, index=-1;
           for(int j=0;j<n;j++){
            if(max<score[j]){
                max=score[j];
                index=j;
            }
           }
           if(i==1){
            ans[index]="Gold Medal";
           }
           else if(i==2){
            ans[index]="Silver Medal";
           }
           else if(i==3){
           ans[index]="Bronze Medal";
           }
           else {
            ans[index]=String.valueOf(i);
           }
           score[index]=-1;
        }
        return ans;
    }
}