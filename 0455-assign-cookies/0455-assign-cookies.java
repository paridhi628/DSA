class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0, c=0;
        int p=g.length-1;
        int q=s.length-1;
       while(i<=p && j<=q){
        if(g[i]<=s[j]){
            c++;
          i++;
          j++;

        }
        else{
        j++;
       }
       }
       return c;
    }
}