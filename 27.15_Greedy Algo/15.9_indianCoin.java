import java.util.*;

class indianCoin {
    public static void printCoin(int amount) {                     //TC-O(n) SC-O(n)  [for ArrayList space is n]
        int count = 0;
        Integer[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());             // decending order of coins

        ArrayList<Integer> ans = new ArrayList<>();                //store the coins

        for (int i = 0; i < coins.length; i++) {                   // iterate over the coins
            if (coins[i] <= amount) {                              // amount should check if it is greater then go inside

                while (coins[i] <= amount) {                       // if coins is less than amount
                    count++;                                       // count incress
                    ans.add(coins[i]);
                    amount -= coins[i];                            // amount will be subtract by coin
                }
            }
        }
        System.out.println(ans);                                   // print the coins
        System.out.println(ans.size());                            // print the count of coins                       
        System.out.println(count);                                 // print the count of coins
    }

    public static void main(String[] args) {
        int value = 590;
        // System.out.println(printCoin(value));
        printCoin(value);
    }
}
