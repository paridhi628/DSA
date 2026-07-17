class Solution {
    public int myAtoi(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(ch[i]==' ' && sb.length()==0){
                continue;
            }
            if((ch[i]=='-' || ch[i]=='+') && sb.length()==0){
                sb.append(ch[i]);
            }
            else if(Character.isDigit(ch[i])){
                sb.append(ch[i]);
            }
            else {
                break;
            }
        }
        String str=sb.toString();
        if (str.equals("") || str.equals("-") || str.equals("+")) {
            return 0;
        }
         try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return str.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}