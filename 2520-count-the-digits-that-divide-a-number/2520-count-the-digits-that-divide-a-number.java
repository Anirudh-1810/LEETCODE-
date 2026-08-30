class Solution {
    public int countDigits(int num) {
        int ans =0;
        int n=num;
        while(num>0){
            int an=num%10;
            if(n%an==0){
                ans++;
            }
            num/=10;
        }
        return ans;
    }
}