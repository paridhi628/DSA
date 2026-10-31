class Solution {
    int count(int n){
        int sum=0;
        while(n>0){
            sum+=n%2;
            n=n/2;
        }
        return sum;
    }
    boolean isPrime(int n){
        int f=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                f++;
            }
        }
        if(f==2){
            return true;
        }
        return false;
    }
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int s=count(i);
            if(isPrime(s)){
                c++;
            }
        }
        return c;
    }
}