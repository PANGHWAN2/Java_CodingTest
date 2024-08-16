package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class p_04 {
    public static void main(String[] args) {
        int[] answer = { 1, 3, 2, 4, 2 };
        int[][] pattern = {
                { 1, 2, 3, 4, 5 },
                { 2, 1, 2, 3, 2, 4, 2, 5 },
                { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }
        };

        int[] scores = new int[3];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answer[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> winners = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                winners.add(i + 1);
            }
        }

        System.out.println((winners));
    }
}
