package boj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String str = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'S') {
                str += "*S";
            } else {
                str += "*LL";
                i++;
            }
        }
        str += "*";
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')
                ans++;
        }
        ans = Math.min(ans, n);
        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();

    }

}
