public class Solution{
	public int maxProfit(int[] prices) {
        int max_profit=0, min_val=Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++) {
        	if(prices[i] < min_val){
        		min_val = prices[i];
        	}
        	else if(prices[i]-min_val > max_profit){
        		max_profit = prices[i] - min_val;
        	}
        }
        return max_profit;
    }
	public static void main(String[] args) {
		System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
	}
}