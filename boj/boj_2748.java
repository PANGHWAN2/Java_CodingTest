package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long arr[] = new long[91];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < 91; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        bw.write(Long.toString(arr[n]));
        bw.flush();
        bw.close();
    }
}
