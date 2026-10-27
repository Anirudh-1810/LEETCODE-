class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        int c=0;
        for(int i =0;i<len;i++){
            int pro=1;
            for(int j =i;j<len;j++){
                pro*=nums[j];
                if(pro<k)c++;
                else break;
            }
        }
        return c;
    }
}