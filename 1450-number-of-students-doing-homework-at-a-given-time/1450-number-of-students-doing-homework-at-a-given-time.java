class Solution {
    public int busyStudent(int[] st, int[] en, int qu) {
        int c=0;
        for(int i =0;i<st.length;i++){
            if(st[i]<=qu && en[i]>=qu){
            c++;
            }
        }
        return c; 
    }
}