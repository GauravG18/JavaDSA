import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j > (n / 2) + 1 && j < n)) {
                    System.out.print(" \t");
                }
                else if (i <= n / 2 && i > 1 && j != (n / 2) + 1 && j != n) {
                    System.out.print(" \t");
                } else if (i >= n / 2 + 2 && i < n && j != (n / 2) + 1 && j != 1) {
                    System.out.print(" \t");
                } else if ((i == n && j < (n / 2) + 1 && j > 1)) {
                    System.out.print(" \t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
