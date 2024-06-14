package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int a1 = 0;
        int a2 = 0;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        outerLoop: for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    a1 = arr[i];
                    a2 = arr[j];
                    break outerLoop;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] != a1 || arr[i] != a2)
                bw.write(Integer.toString(arr[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
