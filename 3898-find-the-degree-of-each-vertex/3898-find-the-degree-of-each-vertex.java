class Solution {
    public int[] findDegrees(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
             ans.add(count);
            count=0;
        }
            int[] arr = new int[ans.size()];

          for (int i = 0; i < ans.size(); i++) {
          arr[i] = ans.get(i);
     }
     return arr;
    }
}