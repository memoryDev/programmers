package 입문.순서쌍의개수;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            int sum = i * (n/i);

            if (sum != n) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}
