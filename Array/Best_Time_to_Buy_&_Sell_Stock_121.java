class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE, profit=0;
        for(int n: prices) {
            if(n<min)
                min=n;
            else
                profit=Math.max(profit, n-min);
        }
        return profit;
    }
}
