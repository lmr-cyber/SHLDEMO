package demo.shl.exam;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Amount Sheldon can spend
        int amount = sc.nextInt();

        // Read Horror books
        int numHorror = sc.nextInt();
        int numH = sc.nextInt(); // Always 2
        int[][] horrorBooks = new int[numHorror][2];
        for (int i = 0; i < numHorror; i++) {
            horrorBooks[i][0] = sc.nextInt(); // hrating
            horrorBooks[i][1] = sc.nextInt(); // hprice
        }

        // Read Sci-fi books
        int numSciFi = sc.nextInt();
        int numS = sc.nextInt(); // Always 2
        int[][] sciFiBooks = new int[numSciFi][2];
        for (int i = 0; i < numSciFi; i++) {
            sciFiBooks[i][0] = sc.nextInt(); // srating
            sciFiBooks[i][1] = sc.nextInt(); // sprice
        }

        System.out.println(maxStarRating(amount, horrorBooks, sciFiBooks));
    }

    public static int maxStarRating(int amount, int[][] horrorBooks, int[][] sciFiBooks) {
        int numHorror = horrorBooks.length;
        int numSciFi = sciFiBooks.length;

        // dp[h][s][price] = max star rating with h horror books selected (0 or 1),
        // s sci-fi books selected (0 or 1), and total price = price
        // We use a 2D array for each category state

        // We'll use a different approach:
        // Find best horror book for each possible price
        // Find best sci-fi book for each possible price
        // Then combine them

        // bestHorror[price] = max rating for horror books with that exact price
        // bestSciFi[price] = max rating for sci-fi books with that exact price
        int[] bestHorror = new int[amount + 1];
        int[] bestSciFi = new int[amount + 1];

        // Initialize with -1 (impossible)
        Arrays.fill(bestHorror, -1);
        Arrays.fill(bestSciFi, -1);

        // Fill horror book data
        for (int i = 0; i < numHorror; i++) {
            int rating = horrorBooks[i][0];
            int price = horrorBooks[i][1];
            if (price <= amount && rating > bestHorror[price]) {
                bestHorror[price] = rating;
            }
        }

        // Fill sci-fi book data
        for (int i = 0; i < numSciFi; i++) {
            int rating = sciFiBooks[i][0];
            int price = sciFiBooks[i][1];
            if (price <= amount && rating > bestSciFi[price]) {
                bestSciFi[price] = rating;
            }
        }

        // For each possible split of budget between horror and sci-fi
        // horrorBudget + sciFiBudget <= amount
        // We need max(bestHorror[h] + bestSciFi[s]) where h + s <= amount
        // and both bestHorror[h] >= 0 and bestSciFi[s] >= 0

        int maxRating = -1;

        for (int hPrice = 1; hPrice <= amount; hPrice++) {
            if (bestHorror[hPrice] == -1) continue;

            int remaining = amount - hPrice;
            for (int sPrice = 1; sPrice <= remaining; sPrice++) {
                if (bestSciFi[sPrice] == -1) continue;
                int totalRating = bestHorror[hPrice] + bestSciFi[sPrice];
                if (totalRating > maxRating) {
                    maxRating = totalRating;
                }
            }
        }

        return maxRating;
    }
}