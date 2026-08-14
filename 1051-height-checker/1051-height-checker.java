class Solution {
    public int heightChecker(int[] height) {
        int[] exp = height.clone();
        int c=0;
        Arrays.sort(exp);
        for(int i =0;i<height.length;i++){
            if(exp[i]!=height[i])c++ ;
        }
        return c;
    }
}