package boj;

import java.io.IOException; // 입출력 예외 처리를 위해 IOException 임포트
import java.io.BufferedReader; // 버퍼를 사용한 입력을 위해 BufferedReader 임포트
import java.io.BufferedWriter; // 버퍼를 사용한 출력을 위해 BufferedWriter 임포트
import java.io.InputStreamReader; // 표준 입력 스트림을 위해 InputStreamReader 임포트
import java.io.OutputStreamWriter; // 표준 출력 스트림을 위해 OutputStreamWriter 임포트
import java.util.LinkedList; // 큐 구현을 위해 LinkedList 임포트
import java.util.Queue; // BFS 구현을 위해 Queue 인터페이스 임포트
import java.util.StringTokenizer; // 입력 파싱을 위해 StringTokenizer 임포트

public class boj_2178 {
    static int n, m; // n은 행의 수, m은 열의 수
    static int[][] arr; // 미로의 정보를 담는 2차원 배열
    static boolean[][] visited; // 방문 여부를 확인하는 2차원 배열
    static int[] dx = { -1, 1, 0, 0 }; // x 방향 배열 (상, 하, 좌, 우 이동)
    static int[] dy = { 0, 0, -1, 1 }; // y 방향 배열 (상, 하, 좌, 우 이동)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위한 BufferedWriter 객체 생성
        StringTokenizer st; // 입력 파싱을 위한 StringTokenizer 객체 생성
        st = new StringTokenizer(br.readLine()); // 첫 번째 줄 입력 (n과 m) 파싱
        n = Integer.parseInt(st.nextToken()); // 첫 번째 토큰 (n) 파싱
        m = Integer.parseInt(st.nextToken()); // 두 번째 토큰 (m) 파싱

        arr = new int[n][m]; // n*m 크기의 미로 배열 초기화
        visited = new boolean[n][m]; // n*m 크기의 방문 여부 배열 초기화

        for (int i = 0; i < n; i++) {
            String line = br.readLine(); // 각 행 입력 받기
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j) - '0'; // 입력 문자를 숫자로 변환하여 미로 배열에 저장
            }
        }

        bfs(0, 0); // 시작 위치 (0, 0)에서 BFS 실행

        bw.write(String.valueOf(arr[n - 1][m - 1])); // 도착 위치 (n-1, m-1)까지의 최소 이동 칸 수 출력
        bw.flush(); // 출력 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>(); // BFS를 위한 큐 생성
        queue.offer(new int[] { x, y }); // 시작 위치를 큐에 삽입
        visited[x][y] = true; // 시작 위치 방문 표시

        while (!queue.isEmpty()) { // 큐가 빌 때까지 반복
            int[] current = queue.poll(); // 큐에서 현재 위치를 꺼냄
            int currentX = current[0];
            int currentY = current[1];

            for (int i = 0; i < 4; i++) { // 상, 하, 좌, 우 방향으로 이동
                int nextX = currentX + dx[i]; // 다음 x 좌표 계산
                int nextY = currentY + dy[i]; // 다음 y 좌표 계산

                // 유효한 범위인지 확인
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m)
                    continue; // 범위를 벗어나면 건너뜀
                // 벽인지 확인
                if (arr[nextX][nextY] == 0)
                    continue; // 벽이면 건너뜀
                // 이미 방문했는지 확인
                if (visited[nextX][nextY])
                    continue; // 방문했으면 건너뜀
                // 갈 수 있는 길이면 큐에 삽입하고 방문 표시
                queue.offer(new int[] { nextX, nextY }); // 다음 위치를 큐에 삽입
                visited[nextX][nextY] = true; // 다음 위치 방문 표시
                // 최소 칸 수를 구하기 위해 현재 위치 값 + 1
                arr[nextX][nextY] = arr[currentX][currentY] + 1;
            }
        }
    }
}
