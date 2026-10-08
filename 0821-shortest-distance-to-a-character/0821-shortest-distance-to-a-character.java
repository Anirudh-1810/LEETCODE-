class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res =new int[s.length()];
        char[] ch = s.toCharArray();
        for(int i =0;i<ch.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<ch.length;j++){
                if(ch[j]== c){
                    min=Math.min(min,Math.abs(i-j));
                }
            }
            res[i]=min;
        }
        return res;
    }
}