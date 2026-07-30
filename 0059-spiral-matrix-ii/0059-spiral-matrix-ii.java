class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat= new int[n][n];
        int tr=0, br= n-1, tc=0, bc=n-1;
        int curr=1;
        while(curr<= n*n){
            // top row
            for(int i=tc; i<=bc;i++){
                mat[tr][i]= curr;
                curr++;
            }
            tr++;
            // bottom column
            for(int i=tr;i<=br;i++){
                mat[i][bc]= curr;
                curr++;
            }
            bc--;
            // bottom row
            if(tr<=br){
            for(int i=bc;i>=tc;i--){
                mat[br][i]=curr;
                curr++;
            }
           br--;}
           //first column
           if(tc<=bc){
           for(int i=br;i>=tr;i--){
            mat[i][tc]=curr;
            curr++;
           }
           tc++;}
        }
        return mat;
    }
}