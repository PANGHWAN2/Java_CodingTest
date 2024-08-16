package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p_02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution_01(new int[] { 4, 2, 2, 1, 3, 4 })));
        System.out.println(Arrays.toString(solution_02(new int[] { 4, 2, 2, 1, 3, 4 })));
    }

    private static int[] solution_01(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        // Arrays.sort(result);
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();

    }

    private static int[] solution_02(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
