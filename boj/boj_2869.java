package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long v = Long.parseLong(st.nextToken());

        // 첫날에 정상에 도달할 수 있는지 확인
        if (a >= v) {
            bw.write("1\n");
        } else {
            // 첫날 이후에 남은 거리
            long remainingDistance = v - a;
            // 하루에 올라가는 순수 거리
            long dailyClimb = a - b;
            // 필요한 추가 일수 계산
            long days = (remainingDistance + dailyClimb - 1) / dailyClimb + 1; // 올림 처리 및 첫날 포함

            bw.write(Long.toString(days) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
