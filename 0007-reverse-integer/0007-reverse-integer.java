class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int dig=x%10;
            if(Integer.MAX_VALUE/10<rev||(Integer.MAX_VALUE/10==rev && dig>7)){
                return 0;
            }
            if(Integer.MIN_VALUE/10>rev||(Integer.MIN_VALUE/10==rev && dig<-8)){
                return 0;
            }
            rev=rev*10+dig;
            x=x/10;
        }
        return rev;
    }
}