class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        int asum=0;
        int ans=0;
        for(int num:apple){
            asum+=num;
        }
        Arrays.sort(cap);
        for(int j=cap.length-1;j>=0;j--){
                asum-=cap[j];
                ans++;
                if(asum<=0){
                    return ans;
                }
            
        }
        return ans;
    }
}