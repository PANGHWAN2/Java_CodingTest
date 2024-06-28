package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        HashSet<String> set = new HashSet<>();
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            set.add(s);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                cnt++;
                al.add(s);
            }
        }
        Collections.sort(al);
        bw.write(Integer.toString(cnt) + "\n");
        for (String name : al) {
            bw.write(name + "\n");
        }
        bw.flush();
        bw.close();
    }
}
