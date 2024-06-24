package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean tag = false;

        for (char c : input.toCharArray()) {
            if (c == '<') {
                if (word.length() > 0) {
                    result.append(word.reverse());
                    word.setLength(0);
                }
                tag = true;
                result.append(c);
            } else if (c == '>') {
                tag = false;
                result.append(c);
            } else if (tag) {
                result.append(c);
            } else if (c == ' ') {
                result.append(word.reverse()).append(' ');
                word.setLength(0);
            } else {
                word.append(c);
            }
        }
        result.append(word.reverse());
        bw.write(result.toString() + "\n");
        bw.flush();
        bw.close();
    }
}
