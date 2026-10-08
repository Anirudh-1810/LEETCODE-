class Solution {
    public long maxPairStrength(int[] nums) {
        long ans=0;
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                long nu =((long)nums[i]*(long)nums[j]);
                long de = gcd(nums[i],nums[j]);
                de*=de;
                ans=Math.max(ans,nu/de);
            }
        }
        return ans;
    }
    public long gcd(long i ,long n){
        if(n==0)return i;
        return gcd(n,i%n);
    }
}