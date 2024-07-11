package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 99999;
        for (int i = n; i <= m; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                if (min > i) {
                    min = i;
                }
                sum += i;
            }
        }
        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(Integer.toString(sum));
            bw.newLine();
            bw.write(Integer.toString(min));
        }
        bw.flush();
        bw.close();
    }
}
