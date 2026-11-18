class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length()-1;
        int l2=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        int c=0;
       while(l1>=0 || l2>=0){
            int sum=c;
            if(l1>=0){
            sum+=num1.charAt(l1)-'0';
             l1--;
            }
            if(l2 >= 0){
                sum+=num2.charAt(l2)-'0';
           
                l2--;
            }
            sb.append(sum%10);
            c=sum/10;
       }
       if(c!=0) sb.append(c);
       return  sb.reverse().toString();
    }
}