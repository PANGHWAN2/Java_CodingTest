package boj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class boj_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            arr[i] = m;
        }
        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[arr.length - 1]);

        bw.flush();
        bw.close();

    }
}
