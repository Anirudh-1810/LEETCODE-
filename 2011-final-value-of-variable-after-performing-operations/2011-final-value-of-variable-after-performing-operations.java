class Solution {
    public int finalValueAfterOperations(String[] op) {
        int val =0;
        for(String s : op){
            if(s.charAt(1)=='+'){
                val++;
            }
            else{
                val--;
            }
        }
        return val;
    }
}