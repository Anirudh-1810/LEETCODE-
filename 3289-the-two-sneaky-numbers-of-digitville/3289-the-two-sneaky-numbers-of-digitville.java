class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        Arrays.sort(nums);
        int idx=0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ans[idx]=nums[i];
                idx++;
            }
        }
        return ans;
    }
}