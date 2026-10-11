class Solution {
    public int dominantIndices(int[] nums) {
        int ans=0;
        for(int i =0;i<nums.length-1;i++){
            int sum=0;
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                c++;  
            }
            if(nums[i]>(double)sum/c){
                ans++;
            }
        }
        return ans;
    }
}