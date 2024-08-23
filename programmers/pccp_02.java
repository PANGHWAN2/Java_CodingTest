package programmers;

public class pccp_02 {
    public static void main(String[] args) {
        int[][] ability_01 = new int[][] { { 40, 10, 10 }, { 20, 5, 0 }, { 30, 30, 30 }, { 70, 0, 70 },
                { 100, 100, 100 } };
        int[][] ability_02 = new int[][] { { 20, 30 }, { 30, 20 }, { 20, 30 } };

        pccp_02 pccp = new pccp_02();

        System.out.println(pccp.solution(ability_01));
        System.out.println(pccp.solution(ability_02));
    }

    int answer = 0;

    public int solution(int[][] ability) {
        fullScan(0, ability, new boolean[ability.length], 0);
        return answer;
    }

    private void fullScan(int current, int[][] ability, boolean[] check, int depth) {
        if (depth == ability[0].length) {
            answer = Math.max(current, answer);
            return;
        }
        for (int i = 0; i < ability.length; i++) {
            if (!check[i]) {
                check[i] = true;
                fullScan(current + ability[i][depth], ability, check, depth + 1);
                check[i] = false;
            }
        }
    }
}
