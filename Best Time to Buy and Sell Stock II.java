//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/

class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] > prices[i-1])
            {
                total = total + (prices[i] - prices[i-1]);
            }
        }
        
        return total;
    }
}
