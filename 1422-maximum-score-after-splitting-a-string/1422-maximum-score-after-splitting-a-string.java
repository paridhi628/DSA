class Solution {
    public int maxScore(String s) {
        int l=s.length();
        int ones=0, zeroes=0,max=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        for(int i=0;i<l-1;i++){
            if(s.charAt(i)=='0'){
                zeroes++;
            }else {
                ones--;
            }
            max=Math.max(max,ones+zeroes);
        }
       return max;
    }
}