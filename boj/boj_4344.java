package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr;

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            double sum = 0;
            for (int j = 0; j < N; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }

            double mean = sum / N;
            double cnt = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] > mean) {
                    cnt++;
                }
            }
            bw.write(String.format("%.3f%%\n", cnt / N * 100));
        }
        bw.flush();
        bw.close();
    }
}
