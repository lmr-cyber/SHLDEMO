package demo.shl.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of employees
        int num = scanner.nextInt();

        // Read efficiencies (index 0 to num-1 corresponds to employee ID 1 to num)
        int[] efficiency = new int[num];
        for (int i = 0; i < num; i++) {
            efficiency[i] = scanner.nextInt();
        }

        // Read number of employees with team ID (same as num)
        int numT = scanner.nextInt();

        // Read team IDs for each employee (employee ID i has team idE[i-1])
        int[] teamId = new int[num];
        for (int i = 0; i < num; i++) {
            teamId[i] = scanner.nextInt();
        }

        // Read number of days and P (always 2)
        int numDays = scanner.nextInt();
        int numE = scanner.nextInt();

        // Map team ID to list of employee indices in that team
        Map<Integer, List<Integer>> teamToEmployees = new HashMap<>();
        for (int i = 0; i < num; i++) {
            int team = teamId[i];
            if (!teamToEmployees.containsKey(team)) {
                teamToEmployees.put(team, new ArrayList<>());
            }
            teamToEmployees.get(team).add(i);
        }

        // Track which employees have been fired/resigned
        boolean[] removed = new boolean[num];
        long totalReputation = 0;
        for (int i = 0; i < num; i++) {
            totalReputation += efficiency[i];
        }

        // Process each day
        int[] results = new int[numDays];
        for (int day = 0; day < numDays; day++) {
            int idFire = scanner.nextInt();  // Employee ID to fire (1-indexed)
            int numResign = scanner.nextInt();  // Number of colleagues to resign

            int firedIndex = idFire - 1;  // Convert to 0-indexed

            if (!removed[firedIndex]) {
                removed[firedIndex] = true;
                totalReputation -= efficiency[firedIndex];
            }

            // Get team of fired employee
            int team = teamId[firedIndex];

            // Build a min-heap of efficiencies for remaining employees in the same team
            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for (int empIndex : teamToEmployees.get(team)) {
                if (!removed[empIndex]) {
                    heap.offer(efficiency[empIndex]);
                }
            }

            // Resign numResign employees with lowest efficiency
            int resigned = 0;
            while (resigned < numResign && !heap.isEmpty()) {
                int lowestEff = heap.poll();
                // Find one employee with this efficiency in the team and mark as removed
                for (int empIndex : teamToEmployees.get(team)) {
                    if (!removed[empIndex] && efficiency[empIndex] == lowestEff) {
                        removed[empIndex] = true;
                        totalReputation -= efficiency[empIndex];
                        resigned++;
                        break;  // Move to next lowest efficiency
                    }
                }
            }

            results[day] = (int) totalReputation;
        }

        // Output results
        for (int i = 0; i < numDays; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(results[i]);
        }
        System.out.println();

        scanner.close();
    }
}