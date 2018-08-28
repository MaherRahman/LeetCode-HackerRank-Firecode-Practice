/* Write an efficient function that takes stock_prices and returns the best profit 
that could have been made from one purchase and one sale of one share of Apple stock.
each index in the array is time in minutes, and values are the price of one share of stock

For example:

  stock_prices = [10, 7, 5, 8, 11, 9]

get_max_profit(stock_prices)
# Returns 6 (buying for $5 and selling for $11)

No "shorting"—you need to buy before you can sell. Also, you can't buy and sell in the 
same time step—at least 1 minute has to pass.
*/

// We could Brute force this and loop through the array checking every pair. 
// This is O(n^2) time and it isn't that great. 

public static int getBestProfit(int[] stocks) {

  int bestProfit = 0;
  
    // go through every stock in the array, and then compare it to every other value
    for (int i = 0; i < stock.length; i++) {
    
      for (int j = 0; j < stock.length; j++) {
        // find the stock from the earlier time
        int firstStock = Math.min(j, i);
        int nextStock = Math.max(j, i);
        
        int firstStockPrice = stock[firstStock];
        int nextStockPrice = stock[nextStock];
        
        // see if this profit is our best profit yet
        int profit = nextStockPrice - firstStockPrice;
        
        // update bestProfit if this profit is bigger
        if(profit > bestProfit) {
          bestProfit = profit;
        }
      }
    }
    
    
    return bestProfit;
}