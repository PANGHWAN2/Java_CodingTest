package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long m = Long.parseLong(br.readLine());
        long n1 = n - (n % 100);
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            if ((n1 + i) % m == 0) {
                cnt = i;
                break;
            }
        }
        String s = String.format("%02d", cnt);
        bw.write(s);
        bw.flush();
        bw.close();
    }
}
