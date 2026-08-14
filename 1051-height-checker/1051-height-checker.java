class Solution {
    public int heightChecker(int[] height) {
        int[] exp = height.clone();
        // for(int i =0;i<height.length;i++){
        //     exp[i]=height[i];
        // }
        Arrays.sort(exp);
        int count=0;
        for(int i =0;i<height.length;i++){
            if(exp[i]!=height[i]){
                count++;
            }

        }
        return count;
    }
}