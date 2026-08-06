class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n>0){
            int lastdig=n%10;
            sum+=lastdig;
            pro*=lastdig;
            n=n/10;
        }
        return pro-sum;
    }
}