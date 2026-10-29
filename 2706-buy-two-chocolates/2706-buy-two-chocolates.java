class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int to=prices[0]+prices[1];
        if(to<=money){
            return money-to;
        }
        return money;
    }
}