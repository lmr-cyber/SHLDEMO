package demo.shl.exam;

import java.util.Scanner;

public class Solution {
    private static final long MOD = 1000000007L;

    /**
     * Fast exponentiation (binary exponentiation) to compute (base^exp) % mod
     * Time complexity: O(log exp)
     */
    private static long fastPow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long secretCode = scanner.nextLong();
        int firstKey = scanner.nextInt();
        int secondKey = scanner.nextInt();

        scanner.close();

        // Compute ((secretCode^firstKey) % 10)
        long step1 = fastPow(secretCode, firstKey, 10);

        // Compute (step1^secondKey) % MOD
        long result = fastPow(step1, secondKey, MOD);

        System.out.println(result);
    }
}