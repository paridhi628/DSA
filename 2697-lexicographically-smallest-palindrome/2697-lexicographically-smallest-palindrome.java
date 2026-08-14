class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() - 1;
       while (i < j) {
            if (sb.charAt(i) > sb.charAt(j)) {
                sb.setCharAt(i, sb.charAt(j));
            } else {
                sb.setCharAt(j, sb.charAt(i));
            }
            i++;
            j--;
        }
        return sb.toString();
    }
}