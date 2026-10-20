class Solution {
    public int sumOfMultiples(int n) {
        int[] ans=new int[n];
        int k=0;
        for(int i=2;i<=n;i++){
            if((i%3==0) || (i%5==0) || (i%7==0)){
                ans[k++]=i;
            }
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=ans[i];
        }
        return sum;
    }
}