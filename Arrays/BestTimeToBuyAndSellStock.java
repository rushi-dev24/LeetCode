class Solution {
   public static int maxProfit(int[] prices) {
		int maxProfit=0,minprice=Integer.MAX_VALUE;
		for(int i=0;i<prices.length;i++) {
			maxProfit=Math.max(maxProfit, prices[i]-minprice);
			minprice=Math.min(minprice, prices[i]);
		}
		return maxProfit;
    }
}
