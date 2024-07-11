// package boj;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.StringTokenizer;

// public class boj_1260 {
//     static StringBuilder sb = new StringBuilder();
//     static boolean[] check;
//     static int[][] arr;

//     static int node, line, start;

//     static Queue<Integer> q = new LinkedList<>();

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         StringTokenizer st;
//         st = new StringTokenizer(br.readLine());
//         node = Integer.parseInt(st.nextToken());
//         line = Integer.parseInt(st.nextToken());
//         start = Integer.parseInt(st.nextToken());

//         arr = new int[node + 1][node + 1];Q
//         check = new boolean[node + 1];

//         for (int i = 0; i < line; i++) {
//             st = new StringTokenizer(br.readLine());

//             int a = Integer.parseInt(st.nextToken());
//             int b = Integer.parseInt(st.nextToken());

//             arr[a][b] = arr[b][a] = 1;
//         }

//         dfs(start);
//         sb.append("\n");
//         check = new boolean[node + 1];

//         bfs(start);

//         bw.write(sb.toString());
//         bw.flush();
//         bw.close();
//     }

//     public static void dfs(int start) {
//         check[start] = true;
//         sb.append(start + " ");

//         for (int i = 0; i <= node; i++) {
//             if (arr[start][i] == 1 && !check[i]) {
//                 dfs(i);
//             }
//         }
//     }

//     public static void bfs(int start) {
//         q.add(start);
//         check[start] = true;

//         while (!q.isEmpty()) {
//             start = q.poll();
//             sb.append(start + " ");

//             for (int i = 1; i <= node; i++) {
//                 if (arr[start][i] == 1 && !check[i]) {
//                     q.add(i);
//                     check[i] = true;
//                 }
//             }
//         }
//     }
// }

package boj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1260 {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;
    static ArrayList<Integer>[] adjList;
    static int node, line, start;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1]; // 인접 행렬
        adjList = new ArrayList[node + 1];// 인접 리스트
        check = new boolean[node + 1];// 방문 여부 체크 배열

        for (int i = 0; i <= node; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
            adjList[a].add(b);
            adjList[b].add(a);
        }
        dfs_matrix(start);
        sb.append("\n");
        resetCheckArray();
        dfs_list(start);
        sb.append("\n");
        resetCheckArray();
        bfs(start);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    public static void dfs_matrix(int start) {
        check[start] = true;
        sb.append(start + " ");

        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i]) {
                dfs_matrix(i);
            }
        }
    }

    public static void dfs_list(int start) {
        check[start] = true;
        sb.append(start + " ");
        for (int next : adjList[start]) {
            if (!check[next]) {
                dfs_list(next);
            }
        }
    }

    public static void bfs(int start) {
        q.add(start);
        check[start] = true;
        while (!q.isEmpty()) {
            int current = q.poll();
            sb.append(current + " ");

            for (int next : adjList[current]) {
                if (!check[next]) {
                    q.add(next);
                    check[next] = true;
                }
            }
        }
    }

    private static void resetCheckArray() {
        for (int i = 0; i <= node; i++) {
            check[i] = false;
        }
    }
}