class Solution {
     static void swap(char[] p, int i, int j){
           char temp=p[i];
           p[i]=p[j];
           p[j]=temp;
        }
        public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            while (start < end && !isVowel(arr[start])) {
                start++;
            }

            while (start < end && !isVowel(arr[end])) {
                end--;
            }
        
            swap(arr, start, end);
            start++;
            end--;
        }

        return new String(arr);
    }
}