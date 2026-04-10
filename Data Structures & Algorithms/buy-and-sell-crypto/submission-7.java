class Solution {
    public int maxProfit(int[] prices) {

        int maxP=0;
        int min_buy = prices[0];

        for(int price:prices){
            min_buy = Math.min(min_buy,price);
            int profit = price - min_buy;
            maxP = Math.max(maxP,profit);
        }

        return maxP;
        
    }
}
