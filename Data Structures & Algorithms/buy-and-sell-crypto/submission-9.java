class Solution {
    public int maxProfit(int[] prices) {

        int maxP = 0;
        int min_buy = prices[0];

        for(int price:prices){
            maxP = Math.max(maxP, price-min_buy);
            min_buy = Math.min(min_buy,price);
        }

        return maxP;
        
    }
}
