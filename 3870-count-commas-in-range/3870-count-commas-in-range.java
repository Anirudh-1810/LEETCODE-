class Solution {
    public int countCommas(int n) {
        if(n>=999 && n<=999999){
            return n-999;
        }
        return 0;
    }
}