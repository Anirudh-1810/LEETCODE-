class Solution {
    public int reverse(int n){
        int rev = 0;
        while(n > 0){
            int lastdig = n % 10;
            rev = rev * 10 + lastdig;
            n/=10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        int m=reverse(n);
        if((m-n)<0){
            return n-m;
        }
        return m-n;
    }
}