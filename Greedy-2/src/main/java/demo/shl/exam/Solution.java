package demo.shl.exam;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] errorScore = new int[num];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < num; i++) {
            errorScore[i] = Integer.parseInt(input[i]);
        }
        int compP = Integer.parseInt(scanner.nextLine());
        int othQ = Integer.parseInt(scanner.nextLine());

        scanner.close();

        System.out.println(minimumProjects(errorScore, compP, othQ));
    }

    /**
     * Calculates the minimum number of projects needed to reduce all error scores to zero.
     * Uses a greedy approach: always have the team member with the highest error score
     * complete a project, as this maximizes the reduction per project.
     */
    public static int minimumProjects(int[] errorScore, int compP, int othQ) {
        if (errorScore == null || errorScore.length == 0) {
            return 0;
        }

        // Check if all scores are already zero
        boolean allZero = true;
        for (int score : errorScore) {
            if (score > 0) {
                allZero = false;
                break;
            }
        }
        if (allZero) {
            return 0;
        }

        // Max heap: sort by score in descending order
        PriorityQueue<TeamMember> pq = new PriorityQueue<>((a, b) -> b.score - a.score);

        for (int i = 0; i < errorScore.length; i++) {
            if (errorScore[i] > 0) {
                pq.offer(new TeamMember(i, errorScore[i]));
            }
        }

        int totalProjects = 0;

        while (!pq.isEmpty()) {
            // Get the team member with the highest score
            TeamMember current = pq.poll();

            // This team member completes a project
            totalProjects++;
            current.score -= compP;
            if (current.score < 0) {
                current.score = 0;
            }

            // Reduce all other team members' scores by Q
            PriorityQueue<TeamMember> nextPq = new PriorityQueue<>((a, b) -> b.score - a.score);
            nextPq.offer(current);  // Put current back

            while (!pq.isEmpty()) {
                TeamMember member = pq.poll();
                member.score -= othQ;
                if (member.score < 0) {
                    member.score = 0;
                }
                if (member.score > 0) {
                    nextPq.offer(member);
                }
            }

            // Check if all scores are zero
            boolean checkAllZero = true;
            for (TeamMember member : nextPq) {
                if (member.score > 0) {
                    checkAllZero = false;
                    break;
                }
            }
            if (checkAllZero) {
                return totalProjects;
            }

            pq = nextPq;
        }

        return totalProjects;
    }

    static class TeamMember {
        int id;
        int score;

        TeamMember(int id, int score) {
            this.id = id;
            this.score = score;
        }
    }
}