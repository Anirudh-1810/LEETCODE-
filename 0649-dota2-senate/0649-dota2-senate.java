class Solution {
    public String predictPartyVictory(String senate) {
        Queue <Integer> rad = new LinkedList<>();
        Queue <Integer> dad = new LinkedList<>();
        int n = senate.length();
        for(int i =0;i<n;i++){
            if(senate.charAt(i)=='R'){
                rad.offer(i);
            }
            else{
                dad.offer(i);
            }
        }
        while(!rad.isEmpty()&& !dad.isEmpty()){
            int rd=rad.poll();
            int dd=dad.poll();
            if(rd<dd){
                rad.offer(n+rd);
            }
            else{
                dad.offer(dd+n);
            }
        }
        return rad.isEmpty() ? "Dire" : "Radiant";

    }

}