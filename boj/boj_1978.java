package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            int m = Integer.parseInt(st.nextToken());
            if (m == 1) {
                continue;
            }
            int c = 0;
            for (int j = 1; j <= m; j++) {
                if (m % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
