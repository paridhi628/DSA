class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int l1=list1.length;
        int l2=list2.length;
        StringBuilder sb=new StringBuilder();
        int sum=Integer.MAX_VALUE;
           for(int i=0;i<l1;i++){
            for(int j = 0; j < l2; j++) {
                if(list1[i].equals(list2[j])) {
                    if(i + j < sum) {
                        sum = i + j;
                        sb.setLength(0);
                        sb.append(list1[i]).append(",");
                    }
                    else if (i + j == sum) {
                        sb.append(list1[i]).append(",");
                    }
                }
            }
        }
        String[] arr = sb.toString().split(",");
        return arr;
    }
}