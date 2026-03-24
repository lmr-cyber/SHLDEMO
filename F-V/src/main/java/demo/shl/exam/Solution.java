package demo.shl.exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatherPos = Integer.parseInt(scanner.nextLine());
        int martinPos = Integer.parseInt(scanner.nextLine());
        int velFather = Integer.parseInt(scanner.nextLine());
        int steps = Integer.parseInt(scanner.nextLine());

        int[] result = solve(fatherPos, martinPos, velFather, steps);
        System.out.println(result[0] + " " + result[1]);

        scanner.close();
    }

    public static int[] solve(int fatherPos, int martinPos, int velFather, int steps) {
        // Generate all positions where father steps on
        Set<Integer> fatherPositions = new HashSet<>();
        for (int i = 0; i <= steps; i++) {
            fatherPositions.add(fatherPos + i * velFather);
        }

        int maxCommon = 0;
        int bestSpeed = 0;

        // Martin's first step must land on a father's footprint
        // So: martinPos + V2 = fatherPos + k * velFather, where k in [0, steps]
        // Therefore: V2 = fatherPos - martinPos + k * velFather

        for (int k = 0; k <= steps; k++) {
            int V2 = fatherPos - martinPos + k * velFather;

            if (V2 <= 0) {
                continue;
            }

            // Count how many of Martin's positions match father's positions
            // Martin's positions: martinPos + V2, martinPos + 2*V2, ...
            // We need to find how many martinPos + i*V2 are in fatherPositions
            int commonCount = 0;

            // Martin's first step position
            int firstPos = martinPos + V2;

            // If first position is not a father's footprint, skip (shouldn't happen by construction)
            if (!fatherPositions.contains(firstPos)) {
                continue;
            }

            commonCount++;

            // Continue to see how many more steps Martin can take that land on father's footsteps
            // We need to find the maximum steps Martin can take
            // martinPos + step * V2 = fatherPos + someMultiple * velFather

            int step = 2;
            while (true) {
                int pos = martinPos + step * V2;
                if (fatherPositions.contains(pos)) {
                    commonCount++;
                    step++;
                } else {
                    break;
                }
            }

            if (commonCount > maxCommon) {
                maxCommon = commonCount;
                bestSpeed = V2;
            } else if (commonCount == maxCommon && V2 > bestSpeed) {
                bestSpeed = V2;
            }
        }

        return new int[]{maxCommon, bestSpeed};
    }
}