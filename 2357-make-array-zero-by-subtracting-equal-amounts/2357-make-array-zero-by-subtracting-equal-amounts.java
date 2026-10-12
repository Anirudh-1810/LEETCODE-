class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> li= new HashSet<>();
        for(int num:nums){
            if(num>0)
            li.add(num);
        }
        return li.size();
    }
}