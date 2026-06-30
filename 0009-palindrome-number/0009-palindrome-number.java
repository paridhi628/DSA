class Solution {
    public boolean isPalindrome(int x){
     if (x < 0) return false;   // negative numbers are not palindrome
        
        int original = x;
        int rem=0;
        int sum=0;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
           x= x/10;
        }
        if(original==sum){
            return true;
        }
        else
         return false;
    }
}