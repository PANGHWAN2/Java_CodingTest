package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++) {

            input[i] = br.readLine();

            if (input[i].length() > max)
                max = input[i].length();

        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < input[j].length()) {
                    result.append(input[j].charAt(i));
                }
            }
        }
        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}
