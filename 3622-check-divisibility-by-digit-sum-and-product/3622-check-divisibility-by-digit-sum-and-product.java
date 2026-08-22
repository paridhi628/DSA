class Solution {
    static int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
             sum=sum+rem;
             n=n/10;
        }
        return sum;
    }
    static int product(int n){
        int p=1;
        while(n>0){
            int rem=n%10;
            p=p*rem;
            n=n/10;
        }
        return p;
    }
    public boolean checkDivisibility(int n) {
        int s=sum(n);
        int p=product(n);
        if(n%(s+p)==0){
            return true;
        }
        return false;
    }
}