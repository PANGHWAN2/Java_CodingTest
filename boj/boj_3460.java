package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;

public class boj_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int m = Integer.parseInt(br.readLine());
            while (m > 0) {
                al.add(m % 2);
                m = m / 2;
            }
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) == 1) {
                    bw.write(j + " ");
                }
            }

        }

        bw.flush();
        bw.close();
    }
}
