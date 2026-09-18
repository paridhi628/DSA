class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,candies[i]);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies<max){
                ans.add(false);
            }
            else {
                ans.add(true);
            }
        }
        return ans;
    }
}