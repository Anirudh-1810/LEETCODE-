class Solution {
    public int[] recoverOrder(int[] ord, int[] fri) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:fri){
            set.add(num);
        }
        int idx=0;
        int[] ans=new int[fri.length];
        for(int i =0;i<ord.length;i++){
            int di=ord[i];
            if(set.contains(di)){
                ans[idx]=di;
                idx++;
            }

        }
        return ans;
    }
}