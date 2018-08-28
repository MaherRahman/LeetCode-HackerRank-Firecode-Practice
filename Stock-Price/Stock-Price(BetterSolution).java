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

// This time, instead of brute forcing our way, we can solve this with a greedy algo
// We will pass through the array only once, keeping track of the smallest price value
// and comparing the smallest price value with our current stock and seeing
// if this new stock difference would net us a better Profit. and if it does, 
// store that value in a variable called bestProfit. At the end of the loop
// we will return the bestProfit obtained

public static int bestProfit(int[] stock) {

    if (stock.length < 2) {
        throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
    }

    // we'll greedily update minPrice and maxProfit, so we initialize
    // them to the first price and the first possible profit
    int minPrice = stock[0];
    int bestProfit = stock[1] - stock[0];

    // start at the second (index 1) time
    // we can't sell at the first time, since we must buy first,
    // and we can't buy and sell at the same time!
    // if we started at index 0, we'd try to buy *and* sell at time 0.
    // this would give a profit of 0, which is a problem if our
    // maxProfit is supposed to be *negative*--we'd return 0.
    for (int i = 1; i < stock.length; i++) {
        int currentPrice = stock[i];

        // see what our profit would be if we bought at the
        // min price and sold at the current price
        int potentialProfit = currentPrice - minPrice;

        // update maxProfit if we can do better
        bestProfit = Math.max(bestProfit, potentialProfit);

        // update minPrice so it's always
        // the lowest price we've seen so far
        minPrice = Math.min(minPrice, currentPrice);
    }

    return bestProfit;
}