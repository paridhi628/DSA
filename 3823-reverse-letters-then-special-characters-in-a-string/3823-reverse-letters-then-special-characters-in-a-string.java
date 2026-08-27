class Solution {
    static void reverse(char[] ch, int i, int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]= temp;
    }
    public String reverseByType(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        int i=0, j=n-1;
        while(i<=j){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                reverse(ch, i, j);
                i++;
                j--;
            }
            else if(!Character.isLetter(ch[i])){
                i++;
            }
            else {
                j--;
            }
        }
        i=0;
        j=n-1;
        while(i<=j){
            if(!Character.isLetterOrDigit(ch[i]) && !Character.isLetterOrDigit(ch[j])){
                reverse(ch, i, j);
                i++;
                j--;
            }
            else if(Character.isLetterOrDigit(ch[i])){
                i++;
            }
            else {
                j--;
            }
        }
        return new String(ch);
    }
}