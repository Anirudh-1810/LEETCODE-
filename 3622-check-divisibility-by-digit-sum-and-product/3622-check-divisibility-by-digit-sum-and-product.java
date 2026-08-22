class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int pro=1;
        int sum=0;
        while(n>0){
            int lastdig=n%10;
            sum+=lastdig;
            pro*=lastdig;
            n=n/10;
            
        }
        int res = pro+sum;

        return org%res==0;
    }
}