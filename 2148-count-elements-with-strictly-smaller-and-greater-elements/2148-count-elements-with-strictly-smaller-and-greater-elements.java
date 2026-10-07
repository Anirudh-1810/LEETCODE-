class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int c=0;
        for(int num : nums){
            if(num>min && num<max){
                c++;
            }
        }
       
        return c;
    }
}