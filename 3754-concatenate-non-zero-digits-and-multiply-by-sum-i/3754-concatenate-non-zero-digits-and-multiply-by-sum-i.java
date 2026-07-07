class Solution {
    public long sumAndMultiply(int n) {
        int c=0;
        int place=1;
        while(n>0){
            int rem=n%10;
             if(rem!=0){
                c=c+rem*place;
                place=place*10;
             }
             n=n/10;
        }
        int sum=0;
        int num=c;
        while(num>0){
          int r=num%10;
          sum= r + sum;
          num=num/10;
        }
        return (long)sum*c;
    }
}