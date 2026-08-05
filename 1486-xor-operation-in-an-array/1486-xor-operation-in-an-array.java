class Solution {
    public int xorOperation(int n, int start) {
       int ans=0;
       int[] nums=new int[n];
       nums[0]=start;
       for(int i =1;i<nums.length;i++){
        nums[i]= start+2*i;
       } 
       for(int i =0;i<nums.length;i++){
        ans^=nums[i];
       }
       return ans;

    }
}