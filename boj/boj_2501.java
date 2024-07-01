package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> ar = new ArrayList<>();
        // int cnt = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                ar.add(i);
            }
        }
        if (m <= ar.size()) {
            bw.write(ar.get(m - 1).toString());
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}
