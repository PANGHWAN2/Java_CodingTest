package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 1110
public class boj_1110 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int cpy = n;

        do {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt++;
        } while (cpy != n);
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
