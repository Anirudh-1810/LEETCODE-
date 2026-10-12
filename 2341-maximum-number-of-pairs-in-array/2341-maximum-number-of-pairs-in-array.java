class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0;
        for(int i = 1; i < nums.length; i++) {
            // Check pair
            if(nums[i] == nums[i-1]) {
                pairs++;
                // We need to skip one element if we have a pair
                // since we already "removed" it.
                i++;
            }
        }
        // Remaining length is original length, minus the amount of pairs*2
        // Because each pair removes 2 nums.
        return new int[]{pairs, nums.length-(pairs*2)};
    }
}