package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n * 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        bw.write("*");
                    } else {
                        bw.write(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        bw.write(" ");
                    } else
                        bw.write("*");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
