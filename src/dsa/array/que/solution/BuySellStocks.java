package dsa.array.que.solution;

public class BuySellStocks {
	
	public static int maxProfit(int prices[]) {
//		You are given an array prices where prices[i] is the price of a given stock on the ith day.
//		You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//		Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
		
//		Brute force approach
//		int diff =0;
//        int max =0;
//        for(int i=0; i<n ; i++){
//            for(int j=i+1; j<n; j++){
//                if(prices[j]> prices[i]){
//                    diff = Math.max(prices[j]- prices[i], diff);
//                }
//
//            }
//        }
		
//		Optimal approach
		int n = prices.length;
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0; i<n; i++) {
			if(prices[i]<minPrice) {
				minPrice = prices[i];
				
			}else if(prices[i]-minPrice>maxProfit) {
				maxProfit = prices[i]-minPrice;
			}
		}
				
		return maxProfit;
	}
}
