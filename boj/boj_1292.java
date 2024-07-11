package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j <= i; j++) {
                al.add(i + 1);
            }
        }
        for (int i = n - 1; i <= m - 1; i++) {
            sum += al.get(i);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
