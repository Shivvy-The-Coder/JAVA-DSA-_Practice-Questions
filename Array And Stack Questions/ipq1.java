import java.util.Arrays;
import java.util.Scanner;

public class MaxProfitStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int[] stocks = new int[N];

        for (int i = 0; i < N; i++) {
            stocks[i] = sc.nextInt();
        }

        System.out.println(maxProfit(stocks));
        sc.close();
    }

    public static int maxProfit(int[] stocks) {
        Arrays.sort(stocks); 
        int maxProfit = 0;
        int lastPicked = -2;  

        for (int i = stocks.length - 1; i >= 0; i--) {
            if (stocks[i] != lastPicked - 1) { 
                maxProfit += stocks[i];
                lastPicked = stocks[i];
            }
        }
        return maxProfit;
    }
}