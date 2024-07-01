package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1158 {
    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // sol_01(n, m);
        sol_02(n, m);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void sol_01(int n, int m) {
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        sb.append("<");

        while (q.size() > 1) {
            for (int i = 0; i < m - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");

    }

    public static void sol_02(int n, int m) {
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        sb.append("<");

        int index = 0;

        while (n > 1) {
            index = (index + (m - 1)) % n;

            sb.append(list.remove(index)).append(", ");
            n--;
        }
        sb.append(list.remove()).append(">");

    }
}
