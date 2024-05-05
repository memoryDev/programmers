package 입문.주사위의_개수;

public class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;

        for (int i : box) {
            answer *= (i / n);
        }

        return answer;
    }
}
