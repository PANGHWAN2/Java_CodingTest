// package boj;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.util.HashMap;
// import java.util.StringTokenizer;

// public class boj_1620 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         StringTokenizer st;
//         st = new StringTokenizer(br.readLine());
//         int n = Integer.parseInt(st.nextToken());
//         int m = Integer.parseInt(st.nextToken());
//         HashMap<String, Integer> siMap = new HashMap<>();
//         HashMap<Integer, String> isMap = new HashMap<>();
//         for (int i = 1; i <= n; i++) {
//             String s = br.readLine();
//             isMap.put(i, s);
//             siMap.put(s, i);
//         }
//         for (int i = 0; i < m; i++) {
//             String s = br.readLine();
//             if (Character.isDigit(s.charAt(0))) {
//                 bw.write(isMap.get(Integer.parseInt(s)) + "\n");
//             } else {
//                 bw.write(siMap.get(s) + "\n");
//             }
//         }
//         bw.flush();
//         bw.close();
//     }
// }

package boj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

public class boj_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> siMap = new HashMap<>();
        HashMap<Integer, String> isMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            isMap.put(i, s);
            siMap.put(s, i);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                bw.write(isMap.get(Integer.parseInt(s)) + "\n");
            } else {
                bw.write(siMap.get(s) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}