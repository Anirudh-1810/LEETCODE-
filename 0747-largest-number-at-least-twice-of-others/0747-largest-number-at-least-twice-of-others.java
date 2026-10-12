class Solution {
    public int dominantIndex(int[] nums) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            if(nums[j]>max){
                max=nums[j];
                ans=j;
            }
        }
        for(int i =0;i<nums.length;i++){
            if (i != ans && 2L * nums[i] > max){
                return -1;
            }
        }
        return ans;
    }
}