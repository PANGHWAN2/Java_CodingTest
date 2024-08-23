package programmers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class pccp_01 {
    public static void main(String[] args) {
        pccp_01 pccp = new pccp_01();

        String input_string_01 = "edeaaabbccd";
        String input_string_02 = "eeddee";
        String input_string_03 = "string";
        String input_string_04 = "zbzbz";
        System.out.println(pccp.solution(input_string_01));
        System.out.println(pccp.solution(input_string_02));
        System.out.println(pccp.solution(input_string_03));
        System.out.println(pccp.solution(input_string_04));
    }

    public String solution(String input_string) {
        // 연속된 중복 문자 제거
        StringBuilder ans = new StringBuilder();
        ans.append(input_string.charAt(0));

        for (int i = 1; i < input_string.length(); i++) {
            if (input_string.charAt(i) != input_string.charAt(i - 1)) {
                ans.append(input_string.charAt(i));
            }
        }

        // 문자 빈도수 계산 및 알파벳 순 정렬
        String result = ans.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(entry -> String.valueOf(entry.getKey()))
                .sorted()
                .collect(Collectors.joining());

        return result.isEmpty() ? "N" : result;
    }
}
