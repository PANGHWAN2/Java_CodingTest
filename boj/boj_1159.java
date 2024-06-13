package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[26];
        int n = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[s.charAt(0) - 'a']++;

        }
        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                ans.append((char) (i + 'a'));
                flag = true;
            }
        }
        if (flag) {
            bw.write(ans.toString());
        } else {
            bw.write("PREDAJA");
        }
        bw.flush();
        bw.close();
    }

}
