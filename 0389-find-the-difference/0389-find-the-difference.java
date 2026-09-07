class Solution {
    public char findTheDifference(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int i=0, j=0;
        char[] ch1=s.toCharArray();
        Arrays.sort(ch1);
        String s1=new String(ch1);
        char[] ch2=t.toCharArray();
        Arrays.sort(ch2);
        String t1=new String(ch2);
       while(i<l1 && j<l2){
         if(s1.charAt(i)==t1.charAt(j)){
            i++;
            j++;
         }
         else {
          return t1.charAt(j);
         }
       }
        return t1.charAt(j);
    }
}