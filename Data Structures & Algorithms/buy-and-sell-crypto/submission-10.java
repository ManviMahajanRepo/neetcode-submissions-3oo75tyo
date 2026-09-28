class Solution {
    public int maxProfit(int[] prices) {

        int min_buy = prices[0];
        int maxP = 0;

        for(int price: prices){

            maxP = Math.max(maxP, price - min_buy);
            min_buy = Math.min(min_buy, price);
        }

        return maxP;
        
    }
}
