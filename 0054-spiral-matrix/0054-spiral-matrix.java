class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int tr=0, br=r-1, tc=0, bc=c-1;
          List<Integer> ans = new ArrayList<>();
         
            while (tr <= br && tc <= bc) {

            // top row
            for (int i = tc; i <= bc; i++) {
                ans.add(matrix[tr][i]);
            }
            tr++;

            // right column
            for (int i = tr; i <= br; i++) {
                ans.add(matrix[i][bc]);
            }
            bc--;

            // bottom row
            if (tr <= br) {
                for (int i = bc; i >= tc; i--) {
                    ans.add(matrix[br][i]);
                }
                br--;
            }

            // left column
            if (tc <= bc) {
                for (int i = br; i >= tr; i--) {
                    ans.add(matrix[i][tc]);
                }
                tc++;
            }
        }

        return ans;
    }
}