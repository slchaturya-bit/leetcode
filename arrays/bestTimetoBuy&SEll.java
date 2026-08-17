class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE; // we use to find the minimum value
        int maxProfit = 0;


        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) // if prices[i] is less than min then upadte min to prices[i]
            {
            min=prices[i];
            }
            // the main core logic is to find the maximum profit so we calculated the profit at each stage
            // if profit is greater than maxProfit update it gradualy til we get the maxProfit 

            int profit = prices[i]- min;
            
            if(profit > maxProfit)
            maxProfit = profit;
        }

        // return the maximum profit that we get 
        return maxProfit;
        
    }
}