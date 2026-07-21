class Solution {
    public int rev(int num){
        int revdig=0;
        while(num>0){
            int lastdig=num%10;
            revdig=revdig*10+lastdig;
            num=num/10;

        }
        return revdig;
    }
    public boolean isSameAfterReversals(int num) {
        int rev1=rev(num);
        int rev2=rev(rev1);
        if(num!=rev2){
            return false;
        }
        return true;
    }
}