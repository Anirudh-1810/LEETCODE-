class Solution {
    public int maxProfit(int[] p) {
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i:p){
            min=Math.min(min,i);
            ans=Math.max(ans,i-min);
        }
        return ans;
    }
}