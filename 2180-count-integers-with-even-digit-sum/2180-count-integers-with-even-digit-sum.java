class Solution {
    public int countEven(int num) {
        int x=0;
        if(num<=9)return num/2;
        for(int i =1;i<=num;i++){
            int m=digsum(i);
            if(m%2==0){
                x++;
            }
        }
        return x;
    }
    public int digsum(int i){
        int ans=0;
        while(i!=0){
            int ld=i%10;
            ans+=ld;
            i=i/10;
        }
        return ans;
    }
}