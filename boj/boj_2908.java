package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();
        String rn = new StringBuilder(n).reverse().toString();
        String rm = new StringBuilder(m).reverse().toString();

        int rna = Integer.parseInt(rn);
        int rma = Integer.parseInt(rm);

        if (rna > rma)
            bw.write(Integer.toString(rna));
        else
            bw.write(Integer.toString(rma));

        bw.flush();
        bw.close();
    }
    // public static void main(String[] args) throws IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // StringTokenizer st = new StringTokenizer(br.readLine());
    // int n = Integer.parseInt(st.nextToken());
    // int m = Integer.parseInt(st.nextToken());

    // bw.write(Integer.toString(reverse(n)));
    // bw.newLine();
    // bw.write(Integer.toString(reverse(m)));

    // bw.flush();
    // bw.close();
    // }

    // public static int reverse(int num) {
    // int h = num % 10 * 100;
    // num /= 10;
    // int t = num % 10 * 10;
    // num /= 10;
    // int o = num;
    // return h + t + o;
    // }

}
