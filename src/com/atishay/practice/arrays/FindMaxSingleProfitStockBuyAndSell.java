package com.atishay.practice.arrays;

//Runtime Complexity: O(n)
//Space Complexity: O(1)
//This is also like Kadane's Algorithm: Finding maxSumSubArray.
//https://www.educative.io/courses/coderust-hacking-the-coding-interview/j2pGW
//Find maximum single sell profit
public class FindMaxSingleProfitStockBuyAndSell {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 7 };

		int currentBuy = arr[0];
		int globalSell = arr[1];
		int currentProfit = globalSell - currentBuy;
		int globalProfit = globalSell - currentBuy;

		for (int i = 1; i < arr.length; i++) {
			currentProfit = arr[i] - currentBuy;

			if (currentProfit > globalProfit) {
				globalProfit = currentProfit;
				// just for information, if the question ask to print sell price also.
				globalSell = arr[i];
			}
			if (arr[i] < currentBuy) {
				currentBuy = arr[i];
			}
		}

		System.out.println("Global Profit Price: " + globalProfit);
	}

}
