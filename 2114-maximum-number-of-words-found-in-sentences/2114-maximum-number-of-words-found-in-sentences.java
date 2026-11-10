class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i = 0; i < sentences.length; i++) {

          String[] words = sentences[i].split(" ");
          ans = Math.max(words.length, ans);
        }
        return ans;
    }
}