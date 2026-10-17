class Solution {
    public int maxProfit(int[] prices) {

        int max_P = 0;
        int min_buy = prices[0];

        for(int price:prices){
            min_buy = Math.min(min_buy,price);
            max_P = Math.max(max_P,price - min_buy);

        }

        return max_P;

        
        
    }
}
