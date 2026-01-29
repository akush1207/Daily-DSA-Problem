package DAY7;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements separated by comma(,):");
        String arr = sc.nextLine();
        int[] prices = Arrays.stream(arr.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Maximum Profit:" + maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            profit = Math.max(profit, price - minPrice);
        }
        return profit;
    }
}
