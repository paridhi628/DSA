class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        boolean f=false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                f=true;
            }
            else if(f){
                return false;
            }
        }
        return true;
    }
}