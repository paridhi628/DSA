class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list1 = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int t=i;
            while(t!=0){
                int rem=t%10;
               if(rem==0 || i%rem!=0){
                break;
               }
               t=t/10;
            }
            if(t==0){
                list1.add(i);
            }
        }
        return list1;
    }
}