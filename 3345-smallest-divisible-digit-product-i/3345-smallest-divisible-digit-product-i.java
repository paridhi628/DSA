class Solution {
    static int product(int n){
        int pr=1;
        if(n<10){
            pr=pr*n;
        }
        else {
            while(n>0){
               int rem= n%10;
               pr=pr*rem;
               n=n/10;
            }
        }
        return pr;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int ans= product(i);
             if(ans%t ==0){
                return i;
             }
        }
        return -1;
    }
}