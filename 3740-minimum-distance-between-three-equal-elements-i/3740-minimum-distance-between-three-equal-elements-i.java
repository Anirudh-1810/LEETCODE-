class Solution {
    public int minimumDistance(int[] nums) {
        int ans=-1;
        for(int i =0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int min = Math.abs(i-j) + Math.abs(j-k)+Math.abs(k-i);
                        if(ans==-1 || ans>min){
                            ans=min;
                        }
                    }

                }
            }
        } 
        return ans; 
    }
}