import java.util.*;
public class coinDenominaton {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        int n=11;
        int[] coin = { 1, 2, 5 };
        coinpermu(coin, n, "");
        // coincomb(coin, n, "", 0);

    }

    // T-1 : coins supply infinite!! permutatuion!
    public static void coinpermu(int[] coin, int amount, String path) {
        if (amount == 0) {
            System.out.println(path);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            coinpermu(coin, amount - coin[i], path + coin[i] + " ");
        }
    }

    // combination!
    public static void coincomb(int[] coin, int amount, String path, int last) {
        if (amount == 0) {
            System.out.println(path);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (int i = last + 1; i < coin.length; i++) {
            coincomb(coin, amount - coin[i], path + coin[i] + " ", last);
        }
    }
}
