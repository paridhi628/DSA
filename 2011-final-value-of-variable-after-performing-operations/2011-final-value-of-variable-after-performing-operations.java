class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int ans=0;
        String a="--X";
        String b="X--";
        String c="++X";
        String d="X++";
        for(int i=0;i<n;i++){
            if(operations[i].equals(a) || operations[i].equals(b)){
             ans-=1;
            }
            else if(operations[i].equals(c) || operations[i].equals(d)){
             ans+=1;
            }
        }
        return ans;
    }
}