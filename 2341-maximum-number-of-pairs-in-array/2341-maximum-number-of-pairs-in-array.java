class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        int pairs = 0;
        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 0; i <= 100; i++) {
            pairs += freq[i] / 2;
        }

        int leftover = nums.length - pairs * 2;

        return new int[]{pairs, leftover};
    }
}