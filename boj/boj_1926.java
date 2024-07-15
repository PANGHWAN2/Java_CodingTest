package boj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class boj_1926 {

    static int n, m; // n과 m은 배열의 크기를 나타냄
    static int[][] arr; // 그림 정보를 담을 2차원 배열
    static boolean[][] visited; // 방문 여부를 기록할 2차원 배열
    static int[] dx = { -1, 1, 0, 0 }; // 상하좌우 이동을 위한 x축 변화량
    static int[] dy = { 0, 0, -1, 1 }; // 상하좌우 이동을 위한 y축 변화량

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받기 위한 BufferedReader
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위한 BufferedWriter
        StringTokenizer st = new StringTokenizer(br.readLine()); // 첫 줄 입력을 받아 n과 m을 설정
        n = Integer.parseInt(st.nextToken()); // n 값 설정
        m = Integer.parseInt(st.nextToken()); // m 값 설정

        arr = new int[n][m]; // n x m 크기의 배열 초기화
        visited = new boolean[n][m]; // n x m 크기의 방문 배열 초기화

        for (int i = 0; i < n; i++) { // 배열에 그림 정보를 입력받음
            st = new StringTokenizer(br.readLine()); // 한 줄 입력 받기
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()); // 배열에 값 저장
            }
        }

        int maxArea = 0; // 가장 큰 그림의 넓이를 저장할 변수
        int numberOfPictures = 0; // 그림의 개수를 저장할 변수

        for (int i = 0; i < n; i++) { // 모든 배열을 순회
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) { // 그림의 일부이고 방문하지 않은 경우
                    int area = bfs(i, j); // BFS를 통해 그림의 넓이를 계산
                    maxArea = Math.max(maxArea, area); // 최대 넓이를 갱신
                    numberOfPictures++; // 그림의 수를 증가
                }
            }
        }

        bw.write(String.valueOf(numberOfPictures) + "\n"); // 그림의 수를 출력
        bw.write(String.valueOf(maxArea) + "\n"); // 가장 큰 그림의 넓이를 출력
        bw.flush(); // 출력 버퍼를 비움
        bw.close(); // BufferedWriter를 닫음
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>(); // BFS를 위한 큐 초기화
        q.offer(new int[] { x, y }); // 시작점 (x, y)를 큐에 추가
        visited[x][y] = true; // 시작점을 방문으로 표시

        int area = 0; // 그림의 넓이를 저장할 변수

        while (!q.isEmpty()) { // 큐가 빌 때까지 반복
            int[] current = q.poll(); // 큐에서 현재 위치를 꺼냄
            int nowX = current[0]; // 현재 x 좌표
            int nowY = current[1]; // 현재 y 좌표
            area++; // 현재 위치를 포함하여 넓이 증가

            for (int i = 0; i < 4; i++) { // 상하좌우 인접한 노드를 탐색
                int nx = nowX + dx[i]; // 새로운 x 좌표
                int ny = nowY + dy[i]; // 새로운 y 좌표

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1 && !visited[nx][ny]) { // 배열 범위 내에 있고,
                                                                                                      // 1이며, 방문하지 않은 경우
                    q.offer(new int[] { nx, ny }); // 새로운 위치를 큐에 추가
                    visited[nx][ny] = true; // 새로운 위치를 방문으로 표시
                }
            }
        }
        return area; // 그림의 넓이를 반환
    }
}
