package practice;

import java.util.HashMap;
import java.util.HashSet;

public class p_06 {
    public static void main(String[] args) {
        String dirs = "LULLLLLLU";
        System.out.println(solution(dirs));
    }

    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

    private static void initLocation() {
        location.put('U', new int[] { 0, 1 });
        location.put('D', new int[] { 0, -1 });
        location.put('L', new int[] { -1, 0 });
        location.put('R', new int[] { 1, 0 });
    }

    public static int solution(String dirs) {
        initLocation();
        int x = 5, y = 5;
        HashSet<String> answer = new HashSet<>();
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isValidMove(nx, ny))
                continue;
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            x = nx;
            y = ny;
        }

        return answer.size() / 2;
    }
}
