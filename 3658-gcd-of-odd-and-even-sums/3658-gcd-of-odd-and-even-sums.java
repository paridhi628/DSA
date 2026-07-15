class Solution {
    public int gcdOfOddEvenSums(int n) {
        int os=n*n;
        int es=n*(n+1);
        while(os%es!=0){
            int rem=os%es;
            os=es;
            es=rem;
        }
        return es;
    }
}