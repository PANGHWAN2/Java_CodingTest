package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_24416 {
    static int n;
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);
        bw.write(cnt1 + "\n" + cnt2);

        bw.flush();
        bw.close();
    }

    static int fib(int n) {

        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int[] f = new int[n + 1]; // 크기가 n+1인 배열 생성
        f[1] = 1; // f[1] 초기화
        f[2] = 1; // f[2] 초기화

        // 피보나치 수열 계산
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2]; // 코드2: f[i]는 f[i-1]과 f[i-2]의 합
            cnt2++;
        }
        return f[n];
    }
}
