class Solution {
    public int minChanges(String s) {
        int c=0;
        int l=s.length();
        String ans="";
        for(int i=0;i<l;i=i+2){
           if(s.charAt(i)=='0' && s.charAt(i+1)!='0'){
            ans+=s.charAt(i);
            ans+='0';
            c++;

           }
           else if(s.charAt(i)=='1' && s.charAt(i+1)!='1'){
            ans+='1';
            c++;
           }
        }
        return c;
    }
}