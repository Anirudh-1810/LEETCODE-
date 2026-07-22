class Solution {
    public int rev(int y){
        int rev=0;
        while(y>0){
            int dig=y%10;
            rev=rev*10+dig;
            y=y/10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        int reve=rev(x);
        if(x!=reve){
            return false;
        }
        return true;
    }
}