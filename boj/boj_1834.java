package boj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long ans = 0;

        for (long k = 1; k < n; k++) {
            ans += k * (n + 1);
        }

        bw.write(Long.toString(ans));
        bw.flush();
        bw.close();
    }
}
