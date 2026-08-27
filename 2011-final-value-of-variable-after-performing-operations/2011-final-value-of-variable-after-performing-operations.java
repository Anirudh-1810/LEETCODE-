class Solution {
    public int finalValueAfterOperations(String[] op) {
        int val =0;
        for(String s : op){
            if(s.equals("X++")){
                val++;
            }
            else if(s.equals("++X")){
                val++;
            }
            else{
                val--;
            }
        }
        return val;
    }
}