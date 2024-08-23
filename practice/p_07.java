package practice;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;

public class p_07 {
    public static void main(String[] args) throws IOException {

        p_07 p = new p_07();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        bw.write(Boolean.toString(p.solution(s)));
        bw.flush();
        bw.close();
    }

    private boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] a = s.toCharArray();

        for (char c : a) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
