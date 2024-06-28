package programmers;

import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class array_01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

        int[] result_01 = sol_01(array, commands);
        int[] result_02 = sol_02(array, commands);
        int[] result_03 = sol_03(array, commands);

        for (int num : result_01) {
            bw.write(Integer.toString(num) + " ");
        }
        bw.newLine();
        for (int num : result_02) {
            bw.write(Integer.toString(num) + " ");
        }
        bw.newLine();
        for (int num : result_03) {
            bw.write(Integer.toString(num) + " ");
        }

        bw.flush();
        bw.close();
    }

    public static int[] sol_01(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;

        for (int i = 0; i < commands.length; i++) {
            int k = 0;

            int[] list = new int[commands[i][1] - commands[i][0] + 1];

            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list[k++] = array[j - 1];
            }
            Arrays.sort(list);
            answer[n++] = list[commands[i][2] - 1];
        }
        return answer;
    }

    public static int[] sol_02(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list.add(array[j - 1]);
                Collections.sort(list);
            }
            answer[i] = list.get(commands[i][2] - 1);
            list.clear();
        }
        return answer;
    }

    public static int[] sol_03(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}
