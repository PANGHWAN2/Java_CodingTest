package programmers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class failure_rate {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 5;
        int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
        int[] result = new int[N];
        result = solution(N, stages);
        bw.write(Arrays.toString(result));
        bw.flush();
        bw.close();
    }

    public static int[] solution(int N, int[] stages) {
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            } else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
        return fails.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey).toArray();

    }
}
