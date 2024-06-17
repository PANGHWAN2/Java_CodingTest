package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = 2;
        while (n != 1) {

            if (n % m == 0) {
                n = n / m;
                bw.write(Integer.toString(m) + "\n");
            } else {
                m++;
            }
        }
        bw.flush();
        bw.close();
    }

}