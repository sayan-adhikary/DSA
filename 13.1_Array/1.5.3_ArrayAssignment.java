class ArrayAssignement {                            //tc=O(n) sc=O(1)   
    static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // Handle edge case of empty or null array
        }
        
        int buy = prices[0];
        int profit = 0;
    
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                // Calculate potential profit and update maximum profit
                profit = Math.max(prices[i] - buy, profit);
            } else {
                // Update buy to the new lower price
                buy = prices[i];
            }
        }
        return profit; // Return the maximum profit
    }
    

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] arre = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arre));
    }
}