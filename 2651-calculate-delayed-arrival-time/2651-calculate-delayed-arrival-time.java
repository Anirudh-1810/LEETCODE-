class Solution {
    public int findDelayedArrivalTime(int ar, int de) {
        int be=ar+de;
        if(be<24){
            return ar+de;
        }
        if(be==24){
            return 0;
        }
        while(be>24){
            be-=24;
        }
        return be;
    }
}