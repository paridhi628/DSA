class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String ans="";
        boolean neg = num < 0;
        num = Math.abs(num);
        while(num>0){
            int rem=num%7;
             ans+=rem;
            num=num/7;
        }
        String rev = "";
        for(int i = ans.length()-1; i >= 0; i--) {
            rev += ans.charAt(i);
        }

        return neg ? "-" + rev : rev;
    }
}