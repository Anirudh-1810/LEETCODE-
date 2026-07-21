class Solution {
    public int maxProfit(int[] price) {
        int sum=0;
       for(int i =0;i<price.length-1;i++){
        if(price[i]<price[i+1]){
            sum+=(price[i+1]-price[i]);
        }
       } 
       return sum;
    }
}