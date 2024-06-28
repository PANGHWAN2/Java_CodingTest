package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String d[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int mon = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int td = 0;
        for (int i = 0; i < mon - 1; i++) {
            td += m[i];
        }
        td = td + day;

        bw.write(d[td % 7]);
        bw.flush();
        bw.close();
    }
}
