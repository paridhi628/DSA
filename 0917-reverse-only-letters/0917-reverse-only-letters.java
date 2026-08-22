class Solution {
    static void reverse(char[] ch, int a, int b){
        char temp=ch[a];
        ch[a]=ch[b];
        ch[b]=temp;
    }
    public String reverseOnlyLetters(String s) {
         char[] ch = s.toCharArray();
        int n=ch.length;
        int i=0,j=n-1;
        while(i<=j){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                reverse(ch,i, j);
                i++;
                j--;
            }
            else if(Character.isLetter(ch[i]) && !Character.isLetter(ch[j])){
                j--;
            }
            else {
                i++;
            }
        }
        return new String(ch);
    }
}