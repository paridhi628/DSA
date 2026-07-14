class Solution {
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reversechar(char[] arr, int st, int end){
             while(st<end){
                swap(arr,st,end);
                st++;
                end--;
             }
    }
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k - 1, n - 1);
            reversechar(arr, i, end);
        }

        return new String(arr);
    }
}