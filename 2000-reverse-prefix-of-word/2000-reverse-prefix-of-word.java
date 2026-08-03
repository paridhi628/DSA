class Solution {
    static String reverse (String s, int i, int j){
      int n=s.length();
      String st="";
      for(int k=j;k>=i;k--){
          st+=s.charAt(k);
      }
      return st;
    }
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        String ans="", st="";
        int idx=-1;
        for(int i=0;i<n;i++){
            st+=word.charAt(i);
            if(word.charAt(i)==ch){
                 idx=i;
                 break;
            }
        }
        if(idx==-1){
            return word;
        }
        ans=reverse(st,0,st.length()-1)+ word.substring(idx+1);
        return ans;
    }
}