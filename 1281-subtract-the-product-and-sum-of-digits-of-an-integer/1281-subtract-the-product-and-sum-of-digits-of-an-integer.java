class Solution {
    int product(int n){
        int p=1;
        while(n>0){
           int rem=n%10;
           p=p*rem;
           n=n/10; 
        }
       return p;
    }
    int sum(int n){
        int s=0;
        while(n>0){
            int rem=n%10;
            s=s+rem;
            n=n/10;
        }
        return s;
    }
    public int subtractProductAndSum(int n) {
        int n1=product(n);
        int n2=sum(n);
        return n1-n2;
    }
}