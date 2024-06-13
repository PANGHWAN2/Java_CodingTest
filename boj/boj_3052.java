package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class boj_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            n = Integer.parseInt(br.readLine());
            int temp = n % 42;
            set.add(temp);
        }
        // for (Integer num : set) {
        // bw.write(num + "\n");
        // }
        bw.write(Integer.toString(set.size()));
        // bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}
