class Solution {
    public int totalMoney(int n) {
        int sum=0;
        if(n<7){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
        }
        else {
             int week = 1;
            int count = 0;

            for(int i = 1; i <= n; i++){
                sum += week + count;
                count++;

                if(count == 7){
                    count = 0;
                    week++;
                }
            }
        }
        return sum;
    }
}