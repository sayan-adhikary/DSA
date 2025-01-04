public class buyAndSellStock {
    static void buyAndSellStock(int []prices){      //TC=O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]){       //profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];  
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4}; 
        buyAndSellStock(prices);
    }
}